package com.box.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.box.service.BoxService;

@RestController
@RequestMapping("/api/box")
public class BoxRestController {
	@Autowired
	private BoxService boxService;
	
	/**
	 * 获取所有柜子信息
	 * @return
	 */
	@GetMapping("/getAllBoxes")
	@ResponseBody
	public Map<String, Object> getAllBoxs(){
		return boxService.getAllBoxs();
	}

}
