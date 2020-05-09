package com.box.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.repository.BoxDao;

@Service
public class BoxServiceImpl implements BoxService{
	@Autowired
	private BoxDao boxDao;
	public Map<String, Object> getAllBoxs() {
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("message", "box");
		map.put("data", boxDao.getAllBoxs());
		return map;
	}

}
