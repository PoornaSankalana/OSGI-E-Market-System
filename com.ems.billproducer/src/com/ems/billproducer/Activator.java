package com.ems.billproducer;

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
			System.out.println("\nBill Producer Started !");
			
			//initialize the bill object
			BillService billService = new BillServiceImpl();
			
			//registering the service
			serviceRegistration = bundleContext.registerService(BillService.class.getName(), billService, null);
		}

		/**
		 * Stop the service
		 */
		public void stop(BundleContext bundleContext) throws Exception {
			System.out.println("Bill Producer Stopped !");
			
			//unregistering the service
			serviceRegistration.unregister();
		}

}
