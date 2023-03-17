package com.ems.billproducer;

import java.util.ArrayList;

public class BillServiceImpl implements BillService{
	
	/**
	 * Get ArrayList of Bill instances
	 * @return ArrayList<Bill>
	 */
	public static ArrayList<Bill> getDataList() {
		
		// returnable array-list initialization
		ArrayList<Bill> eBillList = new ArrayList<Bill>();
		
		Bill eBill1 = new Bill("1", "Janaka Jayasinghe", "0758263120", 1500.00);
		Bill eBill2 = new Bill("2", "Nirmala Madagedara", "0718531204", 500.00);
		Bill eBill3 = new Bill("3", "Nawoda Thathsarani", "0702431896", 3500.00);
		
		eBillList.add(eBill1);
		eBillList.add(eBill2);
		eBillList.add(eBill3);
		
		return eBillList;
	}

	@Override
	public void displayBillList() {
		
		try {
			
			//initializing assignable ArrayList object to get from getDataList() method
			ArrayList<Bill> eBillL = BillServiceImpl.getDataList();
			
			//print ArrayList data object on console
			System.out.println("<<< EBill List >>>");
			System.out.println("--------------------------------------------------------------------");
			System.out.println("ID\tCustomer Name\t\tTelephone\t\tTotal Bill");
			System.out.println("--------------------------------------------------------------------");
			
			for(Bill eBill: eBillL) {
				System.out.println(
						eBill.getBillID() + "\t" +
						eBill.getCustomerName() + "\t" +
						eBill.getCustomerTP() + "\t\t" +
						eBill.getTotalBill() + "\t\t"
				);
			}
			
			System.out.println("--------------------------------------------------------------------\n\n\n");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
