package com.ems.storeproducer;

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
		System.out.println("\nStore Producer Started !");
		
		//initialize the store object
		StoreService storeService = new StoreServiceImpl();
		
		//registering the service
		serviceRegistration = bundleContext.registerService(StoreService.class.getName(), storeService, null);
	}

	/**
	 * Stop the service
	 */
	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Store Producer Stopped !");
		
		//unregistering the service
		serviceRegistration.unregister();
	}

}
