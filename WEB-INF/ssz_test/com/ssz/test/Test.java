package com.ssz.test;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import com.ssz.service.IUserService;

public class Test {
	@Resource
	private IUserService userService = null;

	@org.junit.Test
	public void test1() throws Exception {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("con", " and id=28896 ");
		map = userService.getUserByCon(map);
		System.out.println(map);
	}
}