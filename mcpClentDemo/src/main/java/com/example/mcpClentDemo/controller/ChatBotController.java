package com.example.mcpClentDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.mcpClentDemo.model.ChatRequest;
import com.example.mcpClentDemo.model.ChatResponse;
import com.example.mcpClentDemo.service.ChatBotService;

@RestController
public class ChatBotController {
	
	@Autowired
	private ChatBotService chatbotService;
	

	
	@PostMapping("/chat")
	ResponseEntity<ChatResponse> chat(@RequestBody ChatRequest chatRequest) {
	    String answer = chatbotService.chat(chatRequest.getQuestion());
	    ChatResponse response = new ChatResponse();
	    response.setAnswer(answer);
	    return ResponseEntity.ok(response);
	}
	
}
