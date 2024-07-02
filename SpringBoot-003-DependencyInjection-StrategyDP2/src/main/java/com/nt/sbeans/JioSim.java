package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Dependent class
//@Primary
@Component("jio")
@Lazy
public class JioSim implements ISim {
	
	public JioSim() {
		System.out.println("JioSim.JioSim()::0-param Constructor");
	}

	@Override
	public void connect() {
		System.out.println("JioSim.connect()::Call connected");
	}

	@Override
	public void disconnect() {
		System.out.println("JioSim.disconnect()::Call disconnected");
	}
}
