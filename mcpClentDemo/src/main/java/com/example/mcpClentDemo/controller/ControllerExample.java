package com.example.mcpClentDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerExample {

	@GetMapping("/my")
	public String billa() {
		return "billa";
	}
}
