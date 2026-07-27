package com.javaintro;

public class ArthmaticOpertor {
	public static void addtion() {
		int a = 25;
		int b = 35;
		System.out.println("addtion : " +  (a + b));
		ArthmaticOpertor ao = new ArthmaticOpertor();
		ao.subtraction();
	}
	
	 void subtraction() {
		int a = 40;
		int b = 34;
		System.out.println("subtraction : " + (a - b));
		multiplication();
		
		
	}
	 public static void multiplication() {
		  int a = 65;
		  int b = 63;
		  System.out.println("multiplication : "  +(a * b));
			ArthmaticOpertor ao = new ArthmaticOpertor();
			ao.division();
		
	 }
	 void division() {
		 int a = 40;
		 int b = 20;
		 System.out.println("Division : " + (a / b));

	 }


public static void main (String[]args) {
	addtion();
	
}
	
}