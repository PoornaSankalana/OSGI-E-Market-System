package com.ems.deliverysubscriber;

import com.ems.deliveryproducer.DeliveryService;
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
		System.out.println("Delivery Subscriber Started !\n");
		
		eDeliveryServiceReference = bundleContext.getServiceReference(DeliveryService.class.getName());
		DeliveryService DelService =  (DeliveryService) bundleContext.getService(eDeliveryServiceReference);
					
		DelService.displayDeliveryList();
					
		scanner.next();
	}

	/**
	 * Stop Service
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Delivery Subscriber Stopped !");
		
		bundleContext.ungetService(eDeliveryServiceReference);
	}

}
