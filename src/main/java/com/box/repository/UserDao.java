package com.box.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.box.model.User;

@Component
public interface UserDao {
	
	int addUser(User user);

	int deleteUserById(Integer id);

	int updateUser(User user);

	User getUserByTel(String tel);
	
	List<Map<String, Object>> getAllUsers();
}
