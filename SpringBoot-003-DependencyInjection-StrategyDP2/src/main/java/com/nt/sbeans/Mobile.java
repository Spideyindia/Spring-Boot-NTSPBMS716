package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Target class
@Component("mobile")
public class Mobile {
	
	//Strategy DP rule 2: create dependent classes as loosely coupled classes using Interface and Abstract Classes 
	
	public Mobile() {
		System.out.println("Mobile.Mobile() :: 0-param constructor");
	}
	
	
	
	//Strategy DP rule 1: Use HAS-A over IS-A
	//dependent class as a HAS-A Property
	@Autowired
	@Qualifier("simcard")
	private ISim sim;
	

	//Strategy DP rule 3: Open for extension , closed for modifications
	public final void call() {
		System.out.println("Mobile.call():: Target class method");
		sim.connect();
		
		System.out.println("Call is going on.....");
		
		sim.disconnect();
	}
}
