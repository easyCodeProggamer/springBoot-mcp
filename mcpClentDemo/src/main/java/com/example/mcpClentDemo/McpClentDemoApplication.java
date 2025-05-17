package com.example.mcpClentDemo;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.mcp.SyncMcpToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class McpClentDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpClentDemoApplication.class, args);
	}
	
	@Bean
	public ChatClient chatClient(ChatModel chatModel, SyncMcpToolCallbackProvider toolCallbackProvider) {
	    return ChatClient
	      .builder(chatModel)
	      .defaultTools(toolCallbackProvider.getToolCallbacks())
	      .build();
	}

}
