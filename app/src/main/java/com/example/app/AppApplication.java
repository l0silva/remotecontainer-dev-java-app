package com.example.app;

import org.springframework.boot.SpringApplication;

@SpringBootApplication
@RestController
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}

	@RequestMapping("/")
    public String helloWorld() {
        return "Hello World";
    }
}
