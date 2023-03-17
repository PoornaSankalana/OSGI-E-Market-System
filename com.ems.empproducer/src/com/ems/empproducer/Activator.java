package com.ems.empproducer;

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

		System.out.println("\nEmployee Producer Started !");
		
		//initialize the employee object
		EmployeeService employeeService = new EmployeeServiceImpl();
		
		//registering the service
		serviceRegistration = bundleContext.registerService(EmployeeService.class.getName(), employeeService, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		
		System.out.println("Employee Producer Stopped !");
		
		//unregistering the service
		serviceRegistration.unregister();
	}

}
