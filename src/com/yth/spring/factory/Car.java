package com.yth.spring.factory;

public class Car {
	private String brand;
	private String price;

//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public void setPrice(String price) {
//		this.price = price;
//	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

	public Car(String brand, String price) {
		super();
		this.brand = brand;
		this.price = price;
	}

}
