package com.jobs.domain;

public class Manager extends Employee{

	public Manager(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate)
			throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void pay() {
		// TODO Auto-generated method stub
		super.pay();
	}
	
	

}
