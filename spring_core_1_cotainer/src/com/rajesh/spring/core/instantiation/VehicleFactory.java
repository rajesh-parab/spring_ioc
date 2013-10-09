package com.rajesh.spring.core.instantiation;

public class VehicleFactory {

	public Truck createTruck(){
		return new Truck();
	}
	public Bus createBus(){
		return new Bus();
	}
	
}
