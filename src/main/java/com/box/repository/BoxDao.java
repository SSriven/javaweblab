package com.box.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.box.model.Box;

@Component
public interface BoxDao {
	int addBox(Box box);

	int deleteBoxById(int id);

	int updateBox(Box box);

	Box getBoxById(int id);
	
	List<Map<String, Object>> getAllBoxs();
}
