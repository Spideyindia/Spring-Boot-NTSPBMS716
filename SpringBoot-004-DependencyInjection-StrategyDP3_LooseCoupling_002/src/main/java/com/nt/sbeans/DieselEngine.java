package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Dependent class
//@Primary
@Component("dEngine")
@Lazy
public class DieselEngine implements IEngine {
	
	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine():: 0-param constructor");
	}

	@Override
	public final void start() {
	System.out.println("DieselEngine.start():: Started Diesel Engine");	
	}
	
	@Override
	public final void stop() {
		System.out.println("DieselEngine.start():: Stopped Diesel Engine");	
	}
}
