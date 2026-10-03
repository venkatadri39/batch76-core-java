package com.javaintro;

public class ConstructorDemo {
	String customerName;
	double loanAmount;
	double interstRate;
	double loantensure;
	ConstructorDemo (String customerName,double loanAmount,double interstRate,double loantensure){
	this.customerName=customerName;
	this.loanAmount=loanAmount;
	this.interstRate=interstRate;
	this.loantensure=loantensure;
	}
	void calculateInterst() {
		double ci=loanAmount*interstRate*loantensure /100;
		System.out.println("ci : " + ci);
		
	}
	void calculateAmount() {
		double ta= loanAmount +interstRate;
		System.out.println("ta : " + ta);
	}

	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo("ravi",10000,5,12);
		c.calculateInterst();
		c.calculateAmount();
			
		
	
		
		
		
				
	
;
		
		
 

	}

}
