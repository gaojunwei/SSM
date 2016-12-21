package com.ssz.test;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.ssz.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)		//��ʾ�̳���SpringJUnit4ClassRunner��
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Autowired
	private IUserService userService = null;

	@Test
	public void test1() throws Exception {
		getUserByCons();
	}
	
	
	/*�޸��û���Ϣ���������˻���Ϣ*/
	@Transactional
	public void getUserByCons() throws Exception {
		userService.getUserByCons();
	}
	
}
