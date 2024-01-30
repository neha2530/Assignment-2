package com.example.demo;

import org.apache.camel.CamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;




@SpringBootApplication

public class SpringCamel2Application implements ApplicationRunner{

	
	public static void main(String[] args) {
		SpringApplication.run(SpringCamel2Application.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {;
    }
}
