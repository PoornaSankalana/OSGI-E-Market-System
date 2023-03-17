package com.ems.empproducer;

public class Employee {
	
	//properties
	private String empCode;
	private String name;
	private String telephone;
	private String dateOfJoin;
	
	//constructor
	public Employee(String empCode, String name, String telephone, String dateOfJoin) {
		super();
		this.empCode = empCode;
		this.name = name;
		this.telephone = telephone;
		this.dateOfJoin = dateOfJoin;
	}

	//getters
	public String getEmpCode() {
		return empCode;
	}

	public String getName() {
		return name;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getDateOfJoin() {
		return dateOfJoin;
	}

}
