package com.model;

public abstract class College extends BaseEntity {
	protected final  String cName="ABC";

	
	
	public String getcName() {
		return cName;
	}
	
	public abstract void doTask();
	

}
