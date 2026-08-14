package com.javaintro;

public class Employee1 {
	int employeeId;
	String employeeName;
	String desigation;
	String department;
	int salary;
	String remoteLoction;
	static String companyName="suntechsoultions";
	static String companyLocation=" hitechcity";
	static  {
		System.out.println("welecome to suntechsoultions! employee hrms portal");	
	}
	
	void displayempoyeeDetails() {
		System.out.println("companyName : " + companyName);
		System.out.println("companyLocation :" + companyLocation);
		System.out.println("employeeId : " + employeeId);
		System.out.println("empoyeeName : " + employeeName);
		System.out.println("desigation : " + desigation);
		System.out.println("department :"  + department);
		System.out.println("salary : " + salary);
		System.out.println("remoteLoction : " + remoteLoction);
	}
	void  changepromoteEmployee() {
	desigation = "hod";
		
	}
	void updateSalary(){
		salary = salary +5000;
		
	}
	void updateLoction() {
		remoteLoction="hyderbad";
		
	}
	public static void main(String[] args) {
		Employee1 e = new Employee1();
		e.employeeId =101;
		e.employeeName="simhadri";
		e.desigation ="class teacher";
		e.department ="cse";
		e.salary=50000;
		e.remoteLoction="kphb";
		System.out.println("*******************************************");
		
	
		e.changepromoteEmployee();
		e.updateSalary();
		e.updateLoction();
		e.displayempoyeeDetails();
		
		
		
		
	
		


	}

}
