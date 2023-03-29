package com.agcoassignment.userfeignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClient
public class UserFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserFeignClientApplication.class, args);
	}

}
