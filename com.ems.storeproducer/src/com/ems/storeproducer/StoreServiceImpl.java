package com.ems.storeproducer;

import java.util.ArrayList;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService{
	
	/**
	 * Get ArrayList of Store instances
	 * @return ArrayList<Store>
	 */
	public static ArrayList<Store> getStoreList() {
		//returnable array-list initialization
		ArrayList<Store> eStoreList = new ArrayList<Store>();
		
		Store eStore1 = new Store("ITEM1", "Sunlight", 1000, "SK002");
		Store eStore2 = new Store("ITEM2", "Yogurt  ", 10000, "SK002");
		Store eStore3 = new Store("ITEM3", "Cream Cracker", 5000, "SK002");
		
		eStoreList.add(eStore1);
		eStoreList.add(eStore2);
		eStoreList.add(eStore3);
		
		return eStoreList;
	}

	@Override
	public void displayStoreItems() {
		
		try {
		//initializing assignable ArrayList object to get from getStoreList() method
		ArrayList<Store> eStoreL = StoreServiceImpl.getStoreList();
		
		//print ArrayList data object on console
		System.out.println("<<< EStore Item List >>>");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("ItemCode\tItem Name\t\tQuantity\tStoreKeeper Code");
		System.out.println("--------------------------------------------------------------------");
		
		for(Store store: eStoreL) {
			System.out.println(
					store.getItemCode() + "\t\t" +
					store.getItemName() + "\t\t" +
					store.getQuantity() + "\t\t" +
					store.getSkCode()
			);
		}
		
		System.out.println("--------------------------------------------------------------------");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
