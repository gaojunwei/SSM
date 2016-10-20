package com.ssz.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ssz.service.IUserService;

@Controller
@RequestMapping(path="/web")
public class TestAction {
	
	@Resource(name="userService")
	private IUserService userService;
	
	@RequestMapping(path="/world",method=RequestMethod.GET)
	public String hello(Model model)
	{
		model.addAttribute("msg", "���ã�");
		return "index/index";
	}
	/**
	 * <li>�������ƣ�</li>
	 * <li>����˵����</li>
	 * <li>@param model
	 * <li>@return </li>
	 * 		String
	 * @throws Exception 
	 * @author��gjw
	 */
	@RequestMapping(path="/login",method=RequestMethod.GET)
	public ModelAndView login(String userName,String userPwd) throws Exception
	{
		String strCon = " and cu_loginid='"+userName+"'";
		Map<String, Object> rMap = this.userService.getUserByCon(strCon);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", rMap!=null?rMap:"��ѯ��������");
		mv.setViewName("index/index");
		return mv;
	}
	/**
	 * <li>�������ƣ���ת����¼ҳ��</li>
	 * <li>����˵����</li>
	 * <li>@param model
	 * <li>@return </li>
	 * 		String
	 * @author��gjw
	 */
	@RequestMapping(path="/tologin",method=RequestMethod.GET)
	public String toLogin(Model model)
	{
		return "index/login";
	}
	/**
	 * <li>�������ƣ���ת����¼ҳ��</li>
	 * <li>����˵����</li>
	 * <li>@param model
	 * <li>@return </li>
	 * 		String
	 * @author��gjw
	 */
	@RequestMapping(value="/fileup",method=RequestMethod.POST)
	public ModelAndView upfile(String filename,@RequestParam("file_param")MultipartFile file)
	{
		ModelAndView model = new ModelAndView();
		if(file.isEmpty())
		{
			model.addObject("msg", "��ѡ��Ҫ�ϴ����ļ�");
			model.setViewName("index/login");
			return model;
		}
		String extendsname=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")); //��ȡ.����������磨jpg,gif...��
		if (!(extendsname.equalsIgnoreCase(".jpg") || extendsname.equalsIgnoreCase(".gif")||extendsname.equalsIgnoreCase("png")||extendsname.equalsIgnoreCase("jpeg"))) {
			model.addObject("msg", "�����ʽ����ȷŶ");
			model.setViewName("index/login");
			return model;
		}
		
		File file_ = new File("c:/ce/aaa"+extendsname);
		FileOutputStream fileOutStream = null;
		byte[] bytes;
		try {
			bytes = file.getBytes();
			fileOutStream = new FileOutputStream(file_);
			fileOutStream.write(bytes,0,bytes.length); 
			
		} catch (IOException e) {
			e.printStackTrace();
			model.addObject("msg", "�ļ�����-�쳣1");
			model.setViewName("index/login");
			return model;
		}finally
		{
			try {
				fileOutStream.close();
			} catch (IOException e) {
				e.printStackTrace();
				model.addObject("msg", "�ļ�����-�쳣2");
				model.setViewName("index/login");
				return model;
			}
		}
		
		model.addObject("msg", "�ļ�����ɹ�");
		model.setViewName("index/login");
		return model;
	}
	/**
	 * <li>�������ƣ�����json����</li>
	 * <li>����˵����</li>
	 * <li>@param userName
	 * <li>@param userPwd
	 * <li>@return
	 * <li>@throws Exception </li>
	 * 		ModelAndView
	 * @author��gjw
	 */
	@ResponseBody
	@RequestMapping(path="/getjson",produces="application/json;charset=UTF-8")
	public Map<String,Object> getJson(String userName) throws Exception
	{
		String strCon = " and cu_loginid='"+userName+"'";
		Map<String, Object> rMap = this.userService.getUserByCon(strCon);
		return rMap;
	}
}
