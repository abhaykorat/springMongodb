package com.example.springMongodb;

import com.example.springMongodb.Models.User;
import com.example.springMongodb.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongodbApplication implements CommandLineRunner {

	@Autowired
	private UserRepo userRepo;
	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{

		User u1 = new User("1","abhay","abhay@gmail.com","abyvdsvj,/adfbkbdk");
		userRepo.save(u1);

		System.out.println("********");
		System.out.println(u1);
	}
}
