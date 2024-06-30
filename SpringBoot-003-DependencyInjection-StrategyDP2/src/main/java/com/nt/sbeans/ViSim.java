package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Dependent class
//@Primary
@Component("vi")
@Lazy
public class ViSim implements ISim {
	
	public ViSim() {
		System.out.println("ViSim.ViSim()::0-param Constructor");
	}

	@Override
	public void connect() {
		System.out.println("ViSim.connect()::Call connected");
	}

	@Override
	public void disconnect() {
		System.out.println("ViSim.disconnect()::Call disconnected");
	}
}
