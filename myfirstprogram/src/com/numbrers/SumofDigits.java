package com.numbrers;
import java.util.*;
//input =345;
//output=15;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n = sc.nextInt();
		int sum=0;
		int r=0;
		int count=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			count++;
			sum=sum+r;
			
		}
		System.out.println("sum of the numbers : "+ sum);
		System.out.println("count : "+ count);
		
		sc.close();
		

	}

}
