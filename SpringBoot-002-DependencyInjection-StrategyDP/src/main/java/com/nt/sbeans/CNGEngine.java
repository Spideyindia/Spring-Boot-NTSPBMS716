package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Dependent class
//@Primary
@Component("cEngine")
//@Lazy
public class CNGEngine implements IEngine {
	
	public CNGEngine() {
		System.out.println("CNGEngine.CNGEngine():: 0-param constructor");
	}

	@Override
	public final void start() {
	System.out.println("CNGEngine.start():: Started CNG Engine");	
	}
	
	@Override
	public final void stop() {
		System.out.println("CNGEngine.start():: Stopped CNG Engine");	
	}
}
