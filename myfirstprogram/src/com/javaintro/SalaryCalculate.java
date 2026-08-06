package com.javaintro;

public class SalaryCalculate {
	String EmployeeName;
	double MonthSalary;
	double MonthlyGst;
	double MonthlyPf;
	double NetmonthlySalary;
	double AnnualGst;
	double AnnualPf;
	double AnnualnetSalary;
	void calculateMonthlypf() {
		MonthlyPf = MonthSalary * 2/100;
	}
	void calculateMonthlyGst() {
		MonthlyGst = MonthSalary * 3/100;
	}
	void calculateNetmonthlySalary() {
		NetmonthlySalary = MonthSalary - MonthlyGst - MonthlyPf;
		
	}
	void calculateAnnualGst() {
		AnnualGst = MonthlyGst * 12;
	}
	void calculateAnnualPf() {
		AnnualPf = MonthlyPf *12;
	}
	void calcualteAnnualnetSalary() {
		AnnualnetSalary = NetmonthlySalary *12;
	}
	void displayEmployeeDeatails() {
		System.out.println("EmployeeName : " +EmployeeName);
		System.out.println("MonthSalary : " + MonthSalary);
		System.out.println("MonthlyGst : " + MonthlyGst);
		System.out.println("MonthlyPf : " + MonthlyPf);
		System.out.println("NetmonthlySalary :" + NetmonthlySalary);
		System.out.println("AnnualGst : " + AnnualGst);
		System.out.println("AnnualPf : " + AnnualPf);
		System.out.println("AnnualnetSalary : "+ AnnualnetSalary);
		
}
	public static void main(String[] args) {
		SalaryCalculate s = new SalaryCalculate();
		s.EmployeeName = "simhadri";
		s.MonthSalary  =50000;
		s.calculateMonthlypf();
		s. calculateMonthlyGst();
		s.calculateNetmonthlySalary();
		s.calculateAnnualGst();
	    s.calculateAnnualPf();
	    s. calcualteAnnualnetSalary();
	    s. displayEmployeeDeatails();
	 

	}

}
