package com.woca.logcen.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private LogRepository logRepo;

	@Override
	public void run(String... args) throws Exception {
		logRepo.deleteAll();
		
		

		userRepo.saveAll(Arrays.asList(maria,alex,bob));
	}

}