package com.ssz.service;

import java.util.Map;

public interface IUserService {
	public Map<String, Object> getUserByCon(String strCon) throws Exception;
	public void getUserByCons() throws Exception;
}
