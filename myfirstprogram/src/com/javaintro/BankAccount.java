package com.javaintro;

public class BankAccount {
	double accountNumber;
	String accountholderName;
	double balance;
	String branch;
	BankAccount(double accountNumber,String accountholderName,double balance,String branch){
		this.accountNumber=accountNumber;
		this.accountholderName=accountholderName;
		this.balance=balance;
		this.branch=branch;
		
	}
	BankAccount(BankAccount obj){
		this.accountNumber=obj.accountNumber;
		this.accountholderName=obj.accountholderName;
		this.balance=obj.balance;
		this.branch=obj.branch;
	}
	void display() {
		System.out.println("accountnumber : " + accountNumber);
		System.out.println("accountholderName : "+ accountholderName);
		System.out.println("balance : " + balance );
		System.out.println("branch : " + branch);
		
	}
	

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount(78890330,"simhadri", 600000,"sbi");
		BankAccount b1 = new BankAccount(b);
		b1.branch="pnb";
		b1.balance=90000000;
		b.display();
		System.out.println("copy constructor");
		b1.display();
		
	}

}
