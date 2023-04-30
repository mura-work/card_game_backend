package com.example.card_game_backend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin
public class TestController {

	@RequestMapping(value = "/test")
	@CrossOrigin
	public String test() {
		return "test";
	}

	@RequestMapping(value = "/test2")
	@CrossOrigin
	public Map<String, String> test2() {
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("test1", "aaa");
		hashMap.put("test2", "bbb");
		hashMap.put("test3", "ccc");
		return hashMap;
	}
}
