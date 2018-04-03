package com.training.model;

public class Vehicle {
	private Car car;
	private String type;
	
	public Vehicle(Car car, String type) {
		this.car = car;
		this.type = type;
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void checkCarName() {
		car.checkCarName();
	}

}
