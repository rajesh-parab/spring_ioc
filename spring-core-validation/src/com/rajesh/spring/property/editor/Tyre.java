package com.rajesh.spring.property.editor;

public class Tyre {

	private String tyreName;
	
	public Tyre(String name){
		this.tyreName = name;
	}

	public String getTyreName() {
		return tyreName;
	}

	public void setTyreName(String tyreName) {
		this.tyreName = tyreName;
	}
	
}
