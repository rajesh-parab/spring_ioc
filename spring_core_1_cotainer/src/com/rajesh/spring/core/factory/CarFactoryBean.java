package com.rajesh.spring.core.factory;

import org.springframework.beans.factory.FactoryBean;

import com.rajesh.spring.core.instantiation.Car;

public class CarFactoryBean implements FactoryBean<Car> {

	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car();
	}

	@Override
	public Class<Car> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
