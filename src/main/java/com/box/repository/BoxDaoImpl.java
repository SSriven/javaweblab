package com.box.repository;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.box.model.Box;

@Repository
public class BoxDaoImpl implements BoxDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int addBox(Box box) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteBoxById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int updateBox(Box box) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Box getBoxById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Map<String, Object>> getAllBoxs() {
		String sql = "select * from box";
		List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
		return maps;
	}

}
