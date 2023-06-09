package com.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.entity.User;
import com.ashokit.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		UserRepository Userrepo=context.getBean(UserRepository.class);
		List <User> findAll=Userrepo.findAll();
		for( User user:findAll) {
			System.out.println(user+"Record Alert>>...");
		}
	}

}
