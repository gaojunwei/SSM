package com.ssz.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssz.dao.IUserDao;
import com.ssz.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource
	private IUserDao userDao;
	/*通过条件获得用户信息*/
	public Map<String, Object> getUserByCon(String con) throws Exception {
		return (Map<String, Object>)this.userDao.findUserByCon(con);
	}
	/*修改用户信息，及插入账户信息*/
	@Transactional
	@Test
	public void getUserByCons() throws Exception {
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("ssz_pwd", "qazw");
		map1.put("con", " ");
		
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("xd_id", null);
		map2.put("xd_name", "高军威");
		map2.put("xd_account", "100");
		
		System.out.println("返回影响行数："+this.userDao.updateSSZUser(map1));
		System.out.println("返回影响行数："+this.userDao.insertUserAccount(map2));
		System.out.println("返回插入的数据和自增的主键："+map2);
	}
}
