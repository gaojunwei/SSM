package com.kingkong.webservice.service.impl;


import java.util.List;
import javax.jws.WebService;
import com.kingkong.webservice.javabean.User;
@WebService
public interface ISayHello {
public User getUserById(long id);


public List<User> getAllUsers();
}