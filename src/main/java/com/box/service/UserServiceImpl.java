package com.box.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.box.model.User;
import com.box.repository.UserDao;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;

	public Map<String,Object> getAllUser() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("status", HttpStatus.OK);
		map.put("data", userDao.getAllUsers());
		return map;
	}

	public Map<String, Object> userLogin(String account, String password, String type) {
		Map<String,Object> map = new HashMap<String,Object>();
		User user = userDao.getUserByTel(account);
		if(user != null) {
			if(user.getPassword().equals(password) && user.getType().equals(type)) {
				map.put("success",true);
				map.put("message","登陆成功");
				map.put("data", user);
			}else {
				map.put("success",false);
				map.put("message","用户角色或密码错误");
				map.put("data", null);
			}
		}else {
			map.put("success",false);
			map.put("message","用户不存在");
			map.put("data", null);
		}
		return map;
	}

	public Map<String, Object> userLogon(User user) {
		Map<String,Object> map = new HashMap<String,Object>();
		User user2 = userDao.getUserByTel(user.getTel());
		if(user2 != null) {
			map.put("success",false);
			map.put("message","该用户已存在");
			map.put("data", null);
		}else {
			if(userDao.addUser(user) > 0) {
				map.put("success",true);
				map.put("message","注册成功");
				map.put("data", user);
			}else {
				map.put("success",false);
				map.put("message","注册失败");
				map.put("data", user);
			}
		}
		
		return map;
	}

}
