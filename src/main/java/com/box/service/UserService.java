package com.box.service;

import java.util.Map;

import com.box.model.User;

public interface UserService {
	
	Map<String,Object> getAllUser();
	
	Map<String,Object> userLogin(String account,String password,String type);
	
	Map<String,Object> userLogon(User user);

}
