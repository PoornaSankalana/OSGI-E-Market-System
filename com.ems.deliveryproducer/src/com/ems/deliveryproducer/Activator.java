package com.ems.deliveryproducer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	//declare a instance for service registration
	ServiceRegistration serviceRegistration;

	
	/**
	 * Start the service
	 */
	public void start(BundleContext bundleContext) throws Exception {

		System.out.println("\nDelivery Producer Started !");
		
		//initialize the bill object
		DeliveryService deliveryService = new DiliveryServiceImpl();
		
		//registering the service
		serviceRegistration = bundleContext.registerService(DeliveryService.class.getName(), deliveryService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("Delivery Producer Stopped !");
		
		//unregistering the service
		serviceRegistration.unregister();
	}

}
