package com.ssz.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;


public interface IUserDao {
	
	/**
	 * �����������쳣��
	 * 		mybatis There is no getter for property named 'xx' in 'class java.lang.String��
	 * �쳣���������
	 * 		����ǰ��� @Param("ֵΪmapper�еı�������")
	 * */
	/*ͨ����������û���Ϣ*/
    Map<String, Object> findUserByCon(@Param("con")String con);
    
    int updateSSZUser(Map map);
    
    int insertUserAccount(Map map);
}