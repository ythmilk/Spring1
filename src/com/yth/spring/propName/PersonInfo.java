package com.yth.spring.propName;

public class PersonInfo {
	private Address address;
	private Car car;
	private String name;

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersonInfo [address=" + address + ", car=" + car + ", name=" + name + "]";
	}

}
