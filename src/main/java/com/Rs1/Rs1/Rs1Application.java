package com.Rs1.Rs1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Rs1Application {

	public static void main(String[] args) {
		SpringApplication.run(Rs1Application.class, args);
		Greeting g = new Greeting(1,"abcd");

	}


}
