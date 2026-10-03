package com.javaintro;

public class LoanManagement {
	String customerName;
	double loanAmount;
	int interstRate;
	int loanTenure;
	double calculateIntrest(double loanAmount ,int inerstRate) {
		double interst = loanAmount * interstRate *loanTenure /100;
		return interst;
	}
	
	
	
	
	 double calculatetotalAmount(double loanAmount, int intrestRate){
		 double totalAmount = loanAmount + intrestRate;
	 
            return totalAmount;
	 }
	 
	 double calculatemonthlyEmi(double totalAmount,int loanTensure) {
		 double monthlyemi = totalAmount / (loanTensure * 12);
		 return monthlyemi;
	 }
	void displayloanSummary(int interst,double totalAmount,double monthlyemi) {
		System.out.println("customerName : "+ customerName);
		System.out.println("loanAmount : " + loanAmount);
		System.out.println("interstRate : " + interstRate);
		System.out.println("loanTenure : " + loanTenure);

		
	}
	
	
	
	

	public static void main(String[] args) {
		LoanManagement	 l = new LoanManagement();
		l.customerName= "ramu";
		l.loanAmount = 50000.0;
		l.interstRate=5;
		l.loanTenure = 12;

	double interst	 = l.calculateIntrest(l.loanAmount,l.interstRate);
	System.out.println("interst : " + interst);
	double totalAmount =l.calculatetotalAmount(l.loanAmount,l.interstRate);
	System.out.println("totalAmount : " + totalAmount);
	double monthlyemi =l. calculatemonthlyEmi(totalAmount,l.loanTenure);
	System.out.println("monthlyemi : " + monthlyemi);
	l.displayloanSummary(l.interstRate,totalAmount,monthlyemi);
	
	
		 

	

	}

}
