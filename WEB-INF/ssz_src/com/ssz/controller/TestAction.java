package com.ssz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/web")
public class TestAction {
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
	 * @author：gjw
	 */
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(String userName,@RequestParam(name="userPwd")String password)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("msg", userName+",登录成功！密码："+password);
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
	
}
