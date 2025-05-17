package com.example.mcpServerDemo.RepositoryTool;

import java.util.List;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Component;
@Component
public class AuthorRepository {

	    @Tool(description = "Get mrig details")
	    String getMrig() {
	    	System.out.println("Welcome Mrigank");
	        return "Simple coder";
	    }


	    
}
