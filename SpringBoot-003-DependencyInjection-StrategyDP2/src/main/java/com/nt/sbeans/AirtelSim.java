package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Dependent class
//@Primary
@Component("airtel")
@Lazy
public class AirtelSim implements ISim {
	
	public AirtelSim() {
		System.out.println("AirtelSim.AirtelSim()::0-param Constructor");
	}

	@Override
	public void connect() {
		System.out.println("AirtelSim.connect()::Call connected");
	}

	@Override
	public void disconnect() {
		System.out.println("AirtelSim.disconnect()::Call disconnected");
	}
}
