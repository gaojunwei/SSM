package com.ssz.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

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

}
