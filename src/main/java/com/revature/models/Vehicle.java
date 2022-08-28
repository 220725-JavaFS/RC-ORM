package com.revature.models;

import java.util.Objects;

public class Vehicle {
	
	private String make;
	private String model;
	private int parkingPosition;
	private String color;
	private int id;
	
	
	public Vehicle(String make, String model, int parkingPosition, String color, int id) {
		super();
		this.make = make;
		this.model = model;
		this.parkingPosition = parkingPosition;
		this.color = color;
		this.id = id;
	}


	public Vehicle(String make, String model, int parkingPosition, String color) {
		super();
		this.make = make;
		this.model = model;
		this.parkingPosition = parkingPosition;
		this.color = color;
	}


	public Vehicle() {
		super();
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getParkingPosition() {
		return parkingPosition;
	}


	public void setParkingPosition(int parkingPosition) {
		this.parkingPosition = parkingPosition;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public int hashCode() {
		return Objects.hash(color, id, make, model, parkingPosition);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(color, other.color) && id == other.id && Objects.equals(make, other.make)
				&& Objects.equals(model, other.model) && parkingPosition == other.parkingPosition;
	}


	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", parkingPosition=" + parkingPosition + ", color="
				+ color + ", id=" + id + "]";
	}
	
	
	
	
	
	
	

}
