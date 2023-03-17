package com.ems.empsubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import com.ems.empproducer.EmployeeService;

public class Activator implements BundleActivator {

	// Declare Service Reference objects
	ServiceReference eBillServiceReference, eStoreServiceReference, eDeliveryServiceReference, eEmployeeServiceReference;
	Scanner scanner = new Scanner(System.in);

	/**
	 * Start Service
	 */
	public void start(BundleContext bundleContext) throws Exception {
		System.out.println("Employee Subscriber Started !\n");
		
		eEmployeeServiceReference = bundleContext.getServiceReference(EmployeeService.class.getName());
		EmployeeService empService =  (EmployeeService) bundleContext.getService(eEmployeeServiceReference);
					
		empService.displayEmpList();
					
		scanner.next();
	}

	
	/**
	 * Stop Service
	 */
	public void stop(BundleContext bundleContext) throws Exception {

		System.out.println("Employee Subscriber Stopped !");
		
		bundleContext.ungetService(eEmployeeServiceReference);
	}

}
