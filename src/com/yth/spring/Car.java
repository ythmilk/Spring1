package com.yth.spring;

public class Car {
	private String name;
	private String owner;
	private int tax;
	private double prince;

	public Car(String name, String owner, double prince) {
		super();
		this.name = name;
		this.owner = owner;
		this.prince = prince;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrince(double prince) {
		this.prince = prince;
	}

	public Car() {
	}

	public Car(String name, String owner, int tax) {
		super();
		this.name = name;
		this.owner = owner;
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", owner=" + owner + ", tax=" + tax + ", prince=" + prince + "]";
	}

}
