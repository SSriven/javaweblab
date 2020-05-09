package com.box.rest;

import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.box.model.User;
import com.box.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	/**
	 * ��ȡ�����û���Ϣ
	 * @return
	 */
	@GetMapping("/getAllUser")
	@ResponseBody
	public Map<String,Object> getAllUser(){
		
		return userService.getAllUser();
	}
	
	/**
	 * �û���¼
	 * @param account
	 * @param password
	 * @param type
	 * @return
	 */
	@PostMapping("/userLogin")
	@ResponseBody
	public Map<String,Object> userLogin(String account, String password, String type){
		return userService.userLogin(account, password, type);
	}
	
	/**
	 * �û�ע��
	 * @param tel
	 * @param password
	 * @param type
	 * @param name
	 * @return
	 */
	@PostMapping("/userLogon")
	@ResponseBody
	public Map<String,Object> userLogon(String tel, String password, String type,String name){
		User user = new User();
		user.setId(new Random().nextInt(1000000));
		user.setName(name);
		user.setPassword(password);
		user.setType(type);
		user.setTel(tel);
		return userService.userLogon(user);
	}
}
