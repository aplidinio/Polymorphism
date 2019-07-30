package com.jobs.application;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);		
	}
	
	public void createVolunteer(String name, String address, String phone, String description) throws Exception{
		// TODO Auto-generated method stub
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer);		
	}
	
	public void payAllEmployeers() {
		// TODO Auto-generated method stub
		
		for (int i=0; i<repository.getAllMembers().size(); i++) {
			
			repository.getAllMembers().get(i).pay();
		}
	
	}

	public String getAllEmployees() {
		// TODO Auto-generated method stub
		System.out.println("EMPLOYEES:");

		for (AbsStaffMember person:repository.getAllMembers())	{
			System.out.println(person.getName() + "  " + person.getAddress() + "  " 
					+ person.getPhone() + "  " + person.getTotalPaid());
		}	
	
		return null;
	}
	
}
