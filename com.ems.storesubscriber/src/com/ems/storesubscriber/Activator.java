package com.ems.storesubscriber;

import com.ems.storeproducer.StoreService;
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
	public void start(BundleContext bundleContext) throws Exception {
		
		System.out.println("Store Subscriber Started !\n");
		
		eStoreServiceReference = bundleContext.getServiceReference(StoreService.class.getName());
		StoreService storeService = (StoreService) bundleContext.getService(eStoreServiceReference);
		
		storeService.displayStoreItems();
		
		scanner.next();
		
	}

	/**
	 * Stop Service
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Store Subscriber Stopped !");
		
		bundleContext.ungetService(eStoreServiceReference);
	}

}
