package com.javaintro;
import java.util.*;

public class PerfectNumber {
	static boolean isperfect(int n) {
		boolean  status = false;
		int sum =0;
		for(int i =1; i<=n/2; i++) {
			if(n % i == 0) {
				sum = sum + i;
			}
		}
			
			
		
		if(sum == n) {
			status =
					true;
		}
		return status;
	}
	

	public static void main(String[] args) {
		Scanner  Sc = new Scanner(System.in);
		System.out.println("enter number : ");
		int n = Sc.nextInt();
	 boolean status=isperfect (n);
	 if(status) {
		 System.out.println("the given number is perfect");
	 }
	 else {
		 System.out.println("the given number is  not  perfect");
	 }
	 Sc.close();
	 

	}

}
