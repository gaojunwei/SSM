package com.ssz.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ssz.service.AService;
import com.ssz.service.BService;
import com.ssz.service.IUserService;

@Controller
@RequestMapping(path="/web")
public class TestAction {
	
	@Autowired
	private IUserService userService;
	@Autowired
	private AService aService;
	@Autowired
	private BService bService;
	
	@RequestMapping(path="/world",method=RequestMethod.GET)
	public String hello(Model model)
	{
		model.addAttribute("msg", "您好！");
		return "index/index";
	}
	/**
	 * <li>功能名称：</li>
	 * <li>参数说明：</li>
	 * <li>@param model
	 * <li>@return </li>
	 * 		String
	 * @throws Exception 
	 * @author：gjw
	 */
	@RequestMapping(path="/login",method=RequestMethod.GET)
	public ModelAndView login(String userName,String userPwd) throws Exception
	{
		String strCon = " and cu_loginid='"+userName+"'";
		Map<String, Object> rMap = this.userService.getUserByCon(strCon);
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", rMap!=null?rMap:"查询不到数据");
		mv.setViewName("index/index");
		return mv;
	}
	/**
	 * <li>功能名称：跳转到登录页面</li>
	 * <li>参数说明：</li>
	 * <li>@param model
	 * <li>@return </li>
	 * 		String
	 * @author：gjw
	 */
	@RequestMapping(path="/tologin",method=RequestMethod.GET)
	public String toLogin(Model model)
	{
		return "index/login";
	}
	/**
	 * <li>功能名称：跳转到登录页面</li>
	 * <li>参数说明：</li>
	 * <li>@param model
	 * <li>@return </li>
	 * 		String
	 * @author：gjw
	 */
	@RequestMapping(value="/fileup",method=RequestMethod.POST)
	public ModelAndView upfile(String filename,@RequestParam("file_param")MultipartFile file)
	{
		ModelAndView model = new ModelAndView();
		if(file.isEmpty())
		{
			model.addObject("msg", "请选择要上传的文件");
			model.setViewName("index/login");
			return model;
		}
		String extendsname=file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf(".")); //截取.后面的名字如（jpg,gif...）
		if (!(extendsname.equalsIgnoreCase(".jpg") || extendsname.equalsIgnoreCase(".gif")||extendsname.equalsIgnoreCase("png")||extendsname.equalsIgnoreCase("jpeg"))) {
			model.addObject("msg", "输入格式不正确哦");
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
			model.addObject("msg", "文件保存-异常1");
			model.setViewName("index/login");
			return model;
		}finally
		{
			try {
				fileOutStream.close();
			} catch (IOException e) {
				e.printStackTrace();
				model.addObject("msg", "文件保存-异常2");
				model.setViewName("index/login");
				return model;
			}
		}
		
		model.addObject("msg", "文件保存成功");
		model.setViewName("index/login");
		return model;
	}
	/**
	 * <li>功能名称：返回json数据</li>
	 * <li>参数说明：</li>
	 * <li>@param userName
	 * <li>@param userPwd
	 * <li>@return
	 * <li>@throws Exception </li>
	 * 		ModelAndView
	 * @author：gjw
	 */
	@ResponseBody
	@RequestMapping(path="/getjson",produces="application/json;charset=UTF-8")
	public Map<String,Object> getJson(String userName) throws Exception
	{
		if(userName==null || userName.equals(""))
			userName = "dongcunrui89";
		
		String strCon = userName;
		Map<String, Object> rMap = this.userService.getUserByCon(strCon);
		
		aService.barA();
		aService.fooA("aService.fooA");
		
		bService.barB("bService.barB", 1);
		bService.equals("bService.fooB");
		
		
		return rMap;
	}
}
