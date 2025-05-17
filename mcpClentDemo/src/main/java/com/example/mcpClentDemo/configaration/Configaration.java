package com.example.mcpClentDemo.configaration;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.mcp.SyncMcpToolCallbackProvider;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class Configaration {

	@Bean
	public ChatClient chatClient(ChatModel chatModel, SyncMcpToolCallbackProvider toolCallbackProvider) {
	    return ChatClient
	      .builder(chatModel)
	      .defaultTools(toolCallbackProvider.getToolCallbacks())
	      .build();
	}
}
