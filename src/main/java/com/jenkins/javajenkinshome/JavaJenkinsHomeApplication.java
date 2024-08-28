package com.jenkins.javajenkinshome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaJenkinsHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaJenkinsHomeApplication.class, args);
		System.out.println("Project running");
	}

}
