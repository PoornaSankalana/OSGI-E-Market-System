package com.ems.deliveryproducer;

public class Delivery {
	
	//properties
	private String ID;
	private String cusName;
	private String goodName;
	private double quantity;
	private String telephone;
	private String location;
	private String date;
	private String d_boy;
	
	//constructor
	public Delivery(String iD, String cusName, String goodName, double quantity, String telephone, String location, String date, String d_boy) {
		this.ID = iD;
		this.cusName = cusName;
		this.goodName = goodName;
		this.quantity = quantity;
		this.telephone = telephone;
		this.location = location;
		this.date = date;
		this.d_boy = d_boy;
	}

	//getters
	public String getID() {
		return ID;
	}

	public String getCusName() {
		return cusName;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getLocation() {
		return location;
	}

	public String getDate() {
		return date;
	}

	public String getD_boy() {
		return d_boy;
	}

	public String getGoodName() {
		return goodName;
	}

	public double getQuantity() {
		return quantity;
	}
	
}
