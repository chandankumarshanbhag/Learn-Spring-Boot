package com.learn.LearnSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(LearnSpringBootApplication.class,
				args);
				
		applicationContext.getBean(SpringConcepts.class).run(applicationContext);
	}

}
