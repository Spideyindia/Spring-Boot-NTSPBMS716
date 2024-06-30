package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Mobile;

@SpringBootApplication
@ImportResource("com/nt/sbeans/applicationContext.xml")
public class SpringBoot003DependencyInjectionStrategyDP2 {

	public static void main(String[] args) {
		//get the IOC container 
		ApplicationContext ctx = SpringApplication.run(SpringBoot003DependencyInjectionStrategyDP2.class, args);
		
		//Search for (DL) Target class Spring Bean
		Mobile mobile = ctx.getBean("mobile", Mobile.class);
		
		//calling the target class method 
		mobile.call();
		
		//close the IOC container 
			//Now ApplicationContext ctx is holding object of AnnotationConfigApplicationContext class which is not implementing close() to close the container and hence 
				// we are using another class to call close() and close the IOC container
		((ConfigurableApplicationContext)ctx).close();
	}

}
