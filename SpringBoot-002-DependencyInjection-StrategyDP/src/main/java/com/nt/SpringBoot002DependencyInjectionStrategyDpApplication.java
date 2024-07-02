package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class SpringBoot002DependencyInjectionStrategyDpApplication {

	public static void main(String[] args) {
		//get the IOC container 
		ApplicationContext ctx = SpringApplication.run(SpringBoot002DependencyInjectionStrategyDpApplication.class, args);
		
		//Search for (DL) Target class Spring Bean
		Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);
		
		//calling the target class method 
		vehicle.journey("Hyderabad", "Delhi");
		
		//close the IOC container 
			//Now ApplicationContext ctx is holding object of AnnotationConfigApplicationContext class which is not implementing close() to close the container and hence 
				// we are using another class to call close() and close the IOC container
		((ConfigurableApplicationContext)ctx).close();
	}

}
