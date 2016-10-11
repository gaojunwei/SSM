package com.ssz.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
		Map<String, Object> pMap = new HashMap<String, Object>();
		pMap.put("con", " and cu_loginid='"+userName+"'");
		Map<String, Object> rMap = this.userService.getUserByCon(pMap);
		
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
	
}
