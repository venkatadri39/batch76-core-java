package com.javaintro;

public class MethodsDemo3 {

	public static void main(String[] args) {
	
		addtion(20, 43);

	}

	static  int addtion(int a, int b) {
			System.out.println("addtion : " + (a+b));
			subtraction(69,23);
			return a+ b;
			
	}
	static int subtraction(int a, int b) {
		System.out.println("subtraction : " +  (a - b));
		MethodsDemo3 md = new MethodsDemo3();
		md.multiplication(24,87);
		return a-b;
		
	}
	


	int multiplication(int a, int b) {
		System.out.println("multiplication : " + (a * b));
		divsion(54,6);

		return a * b;
		

	}

	int divsion(int a, int b) {
		System.out.println("divsion : " + ( a/b));

		return a / b;

	}
}