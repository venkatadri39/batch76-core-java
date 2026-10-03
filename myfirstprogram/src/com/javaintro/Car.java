package com.javaintro;
import java .util.*;



public class Car {
	

	public static void main(String[] args) {
		Scanner  sc = new Scanner (System.in);
		System.out.println("enter the rent");
		int r = sc.nextInt();
		System.out.println("enter the days");
		int d = sc.nextInt();
		System.out.println("enter the fees");
		int f = sc.nextInt();
		int rental = dailyrentalRate(r);
		System.out.println("rental : " + rental);
		
		int base =  baserentalRate(d,r);
		System.out.println("base : " + base);
		int ins = insurance(f);
		System.out.println("ins :  " + ins);
		
int total		 = totalCost( rental, base, ins);
System.out.println("total  : " + total);
		

	}
	 static int dailyrentalRate(int rent) {
		return rent;
	}
	 static int baserentalRate(int days , int rent) {
		int cost = days * rent;
		return cost;
	}
	 static int insurance (int  fee) {
		return fee;
		
	}
	 static int totalCost (int rental,int base, int ins) {
		int total =rental + base + ins;
		return total;
	 }
	 
	

}
