package com.microServece.limitServiceDemo.bean;

public class Limitconfiguration {
	
	private int maximum;
	private int minimum;
	
	private Limitconfiguration() {
	
	}
	
	
	public Limitconfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	

}
