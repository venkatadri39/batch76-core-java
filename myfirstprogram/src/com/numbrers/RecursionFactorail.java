package com.numbrers;
import java.util.*;

public class RecursionFactorail {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		int fact=factorial(n);
		System.out.println("recursion : "+ fact);
		sc.close();
		
		
		

	}
	static int factorial(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
	
	

}
