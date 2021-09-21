package com.spring.demoAwspgm001;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("/helloOne")
	public String hello() {
		return"This is Adlin";
	}

}
