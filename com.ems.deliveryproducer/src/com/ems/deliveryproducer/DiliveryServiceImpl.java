package com.ems.deliveryproducer;

import java.util.ArrayList;

public class DiliveryServiceImpl implements DeliveryService{
	
	/**
	 * Get ArrayList of Delivery instances
	 * @return ArrayList<Delivery>
	 */
	public static ArrayList<Delivery> getDeliveryList() {
		
		// returnable array-list initialization
		ArrayList<Delivery> delList = new ArrayList<Delivery>();
		
		Delivery del1 = new Delivery("1", "Nawoda Thathsarani", "Yogurts  ", 50.0,  "0765231504",  "Piliyandala", "2022.03.15", "Rathnayaka");
		Delivery del2 = new Delivery("2", "Udul Dulsara      ", "Ice-Cream", 10.0,  "0715234027",  "Moratuwa   ", "2022.03.16", "Kamal");
		Delivery del3 = new Delivery("3", "Dinuja Minsara    ", "Peanut   ", 500.0, "0789635124", "Bandaragama",  "2022.03.17", "Saman");
		
		delList.add(del1);
		delList.add(del2);
		delList.add(del3);
		
		return delList;
	}

	@Override
	public void displayDeliveryList() {
		
		try {
			//initializing assignable ArrayList object to get from getDeliveryList() method
			ArrayList<Delivery> delL = DiliveryServiceImpl.getDeliveryList();
			
			//print ArrayList data object on console
			System.out.println("<<< Delivery List >>>");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("ID\tCustomer Name\t\tGood Name\t\tQuantity\t\tTelephone\t\tLocation\t\tDate\t\tDelivery Person");
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			for(Delivery Del: delL) {
				System.out.println(
						Del.getID() + "\t" +
						Del.getCusName() + "\t" +
						Del.getGoodName() + "\t\t" +
						Del.getQuantity() + "\t\t\t" +
						Del.getTelephone() + "\t\t" +
						Del.getLocation() + "\t\t" +
						Del.getDate() + "\t\t" +
						Del.getD_boy()
				);
			}
			
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
		
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
