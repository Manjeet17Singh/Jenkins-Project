package com.sapient.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class JenkinsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
		Sum s=null;
		System.out.println(s.add(5,9));
		System.out.println(s.add(6,9));
	}

}
