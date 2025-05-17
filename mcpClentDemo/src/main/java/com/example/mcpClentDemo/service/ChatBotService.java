package com.example.mcpClentDemo.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatBotService {
	@Autowired
	private ChatClient chatClient;
	public String chat(String question) {
	    return chatClient
	      .prompt()
	      .user(question)
	      .call()
	      .content();
	}
}
