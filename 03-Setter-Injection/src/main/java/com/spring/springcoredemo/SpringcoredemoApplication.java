package com.spring.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// explicitly list base packages to scan.
/* 
@SpringBootApplication(scanBasePackages = { "com.spring.springcoredemo", 
											"com.spring.util"
})
*/
@SpringBootApplication
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
