package com.ems.empproducer;

import java.util.ArrayList;



public class EmployeeServiceImpl implements EmployeeService{

	/**
	 * Get ArrayList of Employee instances
	 * @return ArrayList<Employee>
	 */
	public static ArrayList<Employee> getEmpList() {
		
		// returnable array-list initialization
		ArrayList<Employee> empList = new ArrayList<Employee>();
		
		Employee emp1 = new Employee("CA001", "Kasun Jeewaka    ", "0718520360", "2019.01.23");
		Employee emp2 = new Employee("SK002", "Janith Perera    ", "0728563001", "2018.05.07");
		Employee emp3 = new Employee("CA003", "Janaka Sandaruwan", "0753621250", "2021.03.30");
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		return empList;
	}
	
	@Override
	public void displayEmpList() {

		try {
			//initializing assignable ArrayList object to get from getEmpList() method
			ArrayList<Employee> empL = EmployeeServiceImpl.getEmpList();
			
			//print ArrayList data object on console
			System.out.println("<<< Employee List >>>");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("EMPID\tEmployee Name\t\tTelephone\t\tDate of Join");
			System.out.println("--------------------------------------------------------------------");
			
			for(Employee emp: empL) {
				System.out.println(
						emp.getEmpCode() + "\t" +
						emp.getName() + "\t" +
						emp.getTelephone() + "\t\t" +
						emp.getDateOfJoin() + "\t\t"
				);
			}
			
			System.out.println("--------------------------------------------------------------------");
			
		
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
