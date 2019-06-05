package com.gitexample.GitExample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cont")
public class Controller {
	
	@PostMapping("/post")
	public void saveData(String name) {
		System.out.println("name..."+name);
		if(name.equals("Balakishan")) {
			System.out.println("Welcome to Hyderabad");
		}
	}
	
	@GetMapping("/get")
	public String getData() {
		return "Hello";
	}

}
