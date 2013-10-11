package com.rajesh.spring.core.method.injection;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class HackedCalculator implements MethodReplacer{

	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		
		System.out.println(" *********** multiply is hacked ");
		return (int)arg2[0]+(int)arg2[1];
		 
	}

}
