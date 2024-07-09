package com.codingshuttle.sushma.week1Introduction.introductiontoSpringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductiontoSpringbootApplication implements CommandLineRunner {
@Autowired
private CakeBaker cakeBaker;


	public static void main(String[] args) {

		SpringApplication.run(IntroductiontoSpringbootApplication.class, args);
		

	}
	@Override
	public void run(String... args) throws Exception {
		cakeBaker.bakeCake();
	}


}
