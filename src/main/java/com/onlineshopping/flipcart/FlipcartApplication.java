package com.onlineshopping.flipcart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
@SpringBootApplication
public class FlipcartApplication {

	public static void main(String[] args) {SpringApplication.run(FlipcartApplication.class, args);
	}

}
