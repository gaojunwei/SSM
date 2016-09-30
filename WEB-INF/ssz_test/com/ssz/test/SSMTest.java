package com.ssz.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssz.service.IUserService;

public class SSMTest {
	@Resource(name="userService")
	private IUserService userService = null;
	
	@Test
	public void test1() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("con", " and id=28896 ");
		map = userService.getUserByCon(map);
		System.out.println(map);
	}
}