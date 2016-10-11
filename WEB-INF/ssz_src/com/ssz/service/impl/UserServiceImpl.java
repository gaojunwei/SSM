package com.ssz.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssz.dao.DaoSupport;
import com.ssz.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	
	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> getUserByCon(Map<String, Object> map) throws Exception {
		return (Map<String, Object>)this.dao.findForObject("test.findUserByCon", map);
	}
}
