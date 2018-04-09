package com.amdocs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class OpenshiftmetricsApplication {
	
    @RequestMapping("/hello")
    String home() {
        return "Hello openshift!";
    }

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftmetricsApplication.class, args);
	}
	
}
