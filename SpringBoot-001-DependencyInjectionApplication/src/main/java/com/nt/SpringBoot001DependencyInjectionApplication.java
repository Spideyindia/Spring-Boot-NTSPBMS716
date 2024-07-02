package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class SpringBoot001DependencyInjectionApplication {

    //creating a @Bean method to create and return the dependent class object as Spring bean from predefined class
    @Bean
    LocalDateTime createLDT() {
		return LocalDateTime.now();
	}
	
	
	public static void main(String[] args) {
		//getting IOC container 
		ApplicationContext ctx = SpringApplication.run(SpringBoot001DependencyInjectionApplication.class, args);
		
		//Dependency Lookup of target class
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class);
		
		String result = generator.generate("Suresh");
		String result2 = generator.generate("Sumit");
		String result3 = generator.generate("Shankar");
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	}

}
