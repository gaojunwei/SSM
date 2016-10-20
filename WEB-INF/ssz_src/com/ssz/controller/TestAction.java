package com.ssz.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import javax.annotation.Resource;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ssz.service.IUserService;

@Controller
@RequestMapping(value="/web")
public class TestAction {
	
	@Resource(name="userService")
	private IUserService userService;
	
	@RequestMapping(value="/world",method=RequestMethod.GET)
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
	@RequestMapping(value="/login",method=RequestMethod.GET)
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
	@RequestMapping(value="/tologin",method=RequestMethod.GET)
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
	public String upfile(Model model,String filename,File file_param)
	{
		
		
		String realpath="c:/ce";
		String extendsname=filename.substring(filename.lastIndexOf(".")); //截取.后面的名字如（jpg,gif...）
		if (!(extendsname.equalsIgnoreCase(".jpg") || extendsname.equalsIgnoreCase(".gif")||extendsname.equalsIgnoreCase("png")||extendsname.equalsIgnoreCase("jpeg"))) {
			model.addAttribute("msg", "输入格式不正确哦");
			return "index/login";
		}
		String filenames = UUID.randomUUID().toString()+new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date())+extendsname;//将截取到得图片用uuid+时间组成新的名字;
		
		File destFile=new File(realpath,filenames);
		try {
			FileUtils.copyFile(file_param, destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		model.addAttribute("msg", "输入格式不正确哦");
		return "index/login";
	}
}
