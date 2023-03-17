package com.ems.billproducer;

public class Bill {
	
		// properties
		private String billID;
		private String customerName;
		private String customerTP;
		private double totalBill;
		
		// constructor
		public Bill(String billID, String customerName, String customerTP, double totalBill) {
			this.billID = billID;
			this.customerName = customerName;
			this.customerTP = customerTP;
			this.totalBill = totalBill;
		}

		// getters
		public String getBillID() {
			return billID;
		}

		public String getCustomerName() {
			return customerName;
		}

		public String getCustomerTP() {
			return customerTP;
		}

		public double getTotalBill() {
			return totalBill;
		}	

}
