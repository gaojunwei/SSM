package com.kingkong.webservice.service.impl;


import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;
import com.kingkong.webservice.javabean.User;
@WebService
public class SayHelloImpl implements ISayHello {
	@Override
	public User getUserById(long id) {
		User user = new User(100000, "testhao", 29);
		System.out.println(user.toString());
		return user;
	}


	@Override
	public List<User> getAllUsers() {
		List<User> list = new ArrayList<>();
		User user = new User(100000, "test", 29);
		User user1 = new User(100001, "test1", 19);
		User user2 = new User(100002, "test2", 39);
		list.add(user);
		list.add(user1);
		list.add(user2);
		System.out.println(list.toString());
		return list;
	}
}