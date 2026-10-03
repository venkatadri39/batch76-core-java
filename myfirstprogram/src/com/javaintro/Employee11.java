package com.javaintro;

public class Employee11 {
	String employeeName;
	double salary;
	int doorpower;
	boolean blocked;
	Employee11(String employeeName,double salary,int doorpower,boolean blocked){
		this.employeeName=employeeName;
		this.salary=salary;
		this.doorpower=doorpower;
		this.blocked= blocked;
	
	}
	void checkAcees() {
		
		boolean doorHaspower= doorpower >0;
		boolean access=  doorHaspower && !blocked;
		System.out.println("employeename : " + employeeName);
		System.out.println("salary : " + salary);
		System.out.println("doorpower :" + doorpower);
		System.out.println("blocked :  " + blocked);
System.out.println("aceesedstatus : " + access);
if (access) {
	System.out.println("employee is enter allowed ");
}
	else {
		System.out.println("employee is not allowed");
	}
}
		
	

	public static void main(String[] args) {
		Employee11 e = new Employee11("venkat", 30000,1, false);
		e.checkAcees();

	}

}
