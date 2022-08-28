package com.revature.models;

import java.util.Objects;

public class Client {
	
	private String nameF;
	private String nameL;
	private int id;
	private String address;
	private int phoneNumber;
	private String password;
	
	public String getNameF() {
		return nameF;
	}
	public void setNameF(String nameF) {
		this.nameF = nameF;
	}
	public String getNameL() {
		return nameL;
	}
	public void setNameL(String nameL) {
		this.nameL = nameL;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, id, nameF, nameL, password, phoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(nameF, other.nameF)
				&& Objects.equals(nameL, other.nameL) && Objects.equals(password, other.password)
				&& phoneNumber == other.phoneNumber;
	}
	@Override
	public String toString() {
		return "Client [nameF=" + nameF + ", nameL=" + nameL + ", id=" + id + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", password=" + password + "]";
	}
	public Client(String nameF, String nameL, int id, String address, int phoneNumber, String password) {
		super();
		this.nameF = nameF;
		this.nameL = nameL;
		this.id = id;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	public Client() {
		super();
	}
	public Client(String nameF, String nameL, String address, int phoneNumber, String password) {
		super();
		this.nameF = nameF;
		this.nameL = nameL;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.password = password;
	}
	
	
	

}
