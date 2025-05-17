package com.example.mcpServerDemo;

import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.mcpServerDemo.RepositoryTool.AuthorRepository;

@SpringBootApplication
public class McpServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(McpServerDemoApplication.class, args);
	}
	
	@Bean
	ToolCallbackProvider authorTools() {
	    return MethodToolCallbackProvider
	      .builder()
	      .toolObjects(new AuthorRepository())
	      .build();
	}
}
