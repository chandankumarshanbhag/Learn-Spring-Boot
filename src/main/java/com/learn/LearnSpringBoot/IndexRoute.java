package com.learn.LearnSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexRoute {
	@GetMapping(path = "/")
	public String indexRoute() {
		return "Hello world";
	}

	@GetMapping(path = "/home")
	public String indexRoute1() {
		return "Hello world";
	}
}
