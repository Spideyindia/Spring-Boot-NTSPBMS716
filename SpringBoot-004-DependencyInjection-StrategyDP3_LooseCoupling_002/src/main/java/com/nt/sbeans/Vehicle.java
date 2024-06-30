package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//Target class
@Component("vehicle")
public class Vehicle {
	
	//Strategy DP rule 2: create dependent classes as loosely coupled classes using Interface and Abstract Classes 
	
	public Vehicle() {
		System.out.println("Vehicle.Vehicle():: 0-param constructor");
	}
	
	
	
	//Strategy DP rule 1: Use HAS-A over IS-A
	//dependent class as a HAS-A Property
	@Autowired
	@Qualifier("engineChosen")
	private IEngine engine;
		
//	private IEngine pEngine;
	

	//Strategy DP rule 3: Open for extension , closed for modifications
	public final void journey(String startPlace , String endPlace) {
		System.out.println("Vehicle.journey():: Target class method");
		engine.start();
		System.out.println("Vehicle.journey():: Journey started from "+startPlace);
		
		System.out.println("Journey is going on.....");
		
		engine.stop();
		System.out.println("Vehicle.journey():: Journey ended at "+endPlace);
	}
}
