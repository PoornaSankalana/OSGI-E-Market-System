package com.ems.storeproducer;

public class Store {
	
	//properties
	private String itemCode;
	private String itemName;
	private double quantity;
	private String skCode;
	
	
	//constructor
	public Store(String itemCode, String itemName, double quantity, String skCode) {
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.quantity = quantity;
		this.skCode = skCode;
	}

	
	//getters
	public String getItemCode() {
		return itemCode;
	}


	public String getItemName() {
		return itemName;
	}


	public double getQuantity() {
		return quantity;
	}


	public String getSkCode() {
		return skCode;
	}
	
}
