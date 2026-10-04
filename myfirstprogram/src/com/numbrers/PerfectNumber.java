package com.numbrers;
import java.util.*;
//perfect number:sum of the factors is equals to given number which excludes given number
//1---1
//6--1,2,3=6
//28--1,2,4,7,14=28

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
				
			}
		}
		if(n==sum) {
			System.out.println("given number is perfect number");
		}
		else {
			System.out.println("given number is not perect number");
		}
		sc.close();
		
		
		
		

	}

}
