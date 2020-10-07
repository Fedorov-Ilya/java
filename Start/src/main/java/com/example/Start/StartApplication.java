package com.example.Start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = {"com.example.Start"})
@SpringBootApplication
public class StartApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

}
