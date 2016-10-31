package com.ssz.test;

import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ssz.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)		//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})

public class TestMyBatis {
	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Autowired
	private IUserService userService = null;

	/*private ApplicationContext ac = null;
	@Before
	public void before() {
		ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
		userService = (IUserService) ac.getBean("userService");
	}*/

	@Test
	public void test1() throws Exception {
		Map<String, Object> rMap = userService.getUserByCon(" and cu_loginid='dongcunrui89'");
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(rMap));
	}
}
