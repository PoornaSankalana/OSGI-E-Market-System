package com.ems.billsubscriber;

import com.ems.billproducer.BillService;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	// Declare Service Reference objects
	ServiceReference eBillServiceReference, eStoreServiceReference, eDeliveryServiceReference, eEmployeeServiceReference;
	Scanner scanner = new Scanner(System.in);
				
	/**
	 * Start Service
	 */
	public void start(BundleContext context) throws Exception {
					
		System.out.println("Bill Subscriber Started !\n");
					
		eBillServiceReference = context.getServiceReference(BillService.class.getName());
		BillService billService =  (BillService) context.getService(eBillServiceReference);
					
		billService.displayBillList();
					
		scanner.next();
					
	}

				
	/**
	 * Stop Service
	 */
	public void stop(BundleContext context) throws Exception {

		System.out.println("Bill Subscriber Stopped !");
					
		context.ungetService(eBillServiceReference);
					
	}

}
