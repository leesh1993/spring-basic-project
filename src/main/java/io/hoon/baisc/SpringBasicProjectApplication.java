package io.hoon.baisc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "io.hoon")
public class SpringBasicProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBasicProjectApplication.class, args);
	}

}
