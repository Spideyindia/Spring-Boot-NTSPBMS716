package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Dependent class
//@Primary
@Component("pEngine")
@Lazy
public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine():: 0-param constructor");
	}

	@Override
	public final void start() {
	System.out.println("PetrolEngine.start():: Started Petrol Engine");	
	}
	
	@Override
	public final void stop() {
		System.out.println("PetrolEngine.start():: Stopped Petrol Engine");	
	}
}
