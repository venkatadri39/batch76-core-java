package com.javaintro;
import java.util.*;

public class Sumeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		int sum=0;
		int rem=0;
		int postion=1;
		
		while(n>0) {
			rem=n%10;
			if(rem%2==0) {
				sum= sum+rem;
			}
			n= n/10;
			postion++;
			
		
			
			
			
			
		}
		sc.close();
		System.out.println(sum);

	}

}
