package com.ems.marketsubscriber;

import com.ems.billproducer.BillService;
import com.ems.deliveryproducer.DeliveryService;
import com.ems.empproducer.EmployeeService;
import com.ems.storeproducer.StoreService;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

/**
 * Market service subscriber
 * @author CSSE_WE_54
 */
public class Activator implements BundleActivator {
	
	// Declare Service Reference objects
	ServiceReference eBillServiceReference, eStoreServiceReference, eDeliveryServiceReference, eEmployeeServiceReference;
	Scanner scanner = new Scanner(System.in);

	/**
	 * Start Service
	 */
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("\nMarket Subscriber Started !\n");
		
		
		//infinite loop of menu
		while(true) {
			//print option menu
			System.out.println(
					"\n\n" +
					"\n*********************************************" +
					"\n              E-Market System" +
					"\n*********************************************\n"
			);
			
			System.out.println(
					"Option Menu >>>\n" +
					"(1) - Bill\n" +
					"(2) - Employee\n" +
					"(3) - Store\n" +
					"(4) - Delivery\n\n"
			);
			
			// Input option value
			System.out.print(">>> ");
			String inputOption = scanner.next();
			
			// Start service according to the option input
			switch (inputOption) {
			case "1": {
				eBillServiceReference = bundleContext.getServiceReference(BillService.class.getName());
				BillService billService =  (BillService) bundleContext.getService(eBillServiceReference);
			
				billService.displayBillList();
				continue;
			}
			case "2": {
				eEmployeeServiceReference = bundleContext.getServiceReference(EmployeeService.class.getName());
				EmployeeService empService =  (EmployeeService) bundleContext.getService(eEmployeeServiceReference);
							
				empService.displayEmpList();
				continue;
			}
			case "3": {
				eStoreServiceReference = bundleContext.getServiceReference(StoreService.class.getName());
				StoreService storeService = (StoreService) bundleContext.getService(eStoreServiceReference);
				
				storeService.displayStoreItems();
				continue;
			}
			case "4": {
				eDeliveryServiceReference = bundleContext.getServiceReference(DeliveryService.class.getName());
				DeliveryService DelService =  (DeliveryService) bundleContext.getService(eDeliveryServiceReference);
							
				DelService.displayDeliveryList();
				continue;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + inputOption);
			}
		}
	}

	/**
	 * Stop Service
	 */
	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("Market Subscriber Stopped !\n");
		
		bundleContext.ungetService(eBillServiceReference);
		bundleContext.ungetService(eEmployeeServiceReference);
		bundleContext.ungetService(eStoreServiceReference);
		bundleContext.ungetService(eDeliveryServiceReference);
	}

}
