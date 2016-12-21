package com.ssz.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Param;


public interface IUserDao {
	
	/**
	 * 可能遇到的异常：
	 * 		mybatis There is no getter for property named 'xx' in 'class java.lang.String；
	 * 异常解决方案：
	 * 		参数前添加 @Param("值为mapper中的变量名称")
	 * */
	/*通过条件获得用户信息*/
    Map<String, Object> findUserByCon(@Param("con")String con);
    
    int updateSSZUser(Map map);
    
    int insertUserAccount(Map map);
}