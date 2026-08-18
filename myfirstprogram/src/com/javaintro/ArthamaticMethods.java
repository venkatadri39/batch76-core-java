package com.javaintro;

import java.util.Scanner;

public class ArthamaticMethods {
	int addtion (int a, int b) {
		return a + b;
	}
	int subtraction(int a, int b) {
		return a - b;	}
	int multipication(int a, int b) {
		return a * b;
	}
	int division (int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		ArthamaticMethods obj = new ArthamaticMethods();
		System.out.println("enter a value");
		int  a  = sc.nextInt();
		System.out.println("enter b value");
		int b = sc.nextInt();
		int result = obj.addtion(a, b);
		System.out.println("addtion : " + result);
		result =obj.subtraction(result,4);
		System.out.println("subtraction : " + result);
		result =  obj. multipication(result,3);
		System.out.println("multiplication : " + result );
		result = obj.division(result, 2);
		System.out.println("division : " + result);		
		sc.close();
		
		
		
		

	}

}
