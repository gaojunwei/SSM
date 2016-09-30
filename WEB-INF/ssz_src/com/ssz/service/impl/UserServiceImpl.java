package com.ssz.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import com.ssz.service.IUserService;

public class UserServiceImpl implements IUserService {
	
	@Resource(name = "daoSupport")
	private com.ssz.dao.DaoSupport dao;
	
	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> getUserByCon(Map<String, Object> map) throws Exception {
		return (Map<String, Object>)this.dao.findForObject("test.findUserById", map);
	}
}
