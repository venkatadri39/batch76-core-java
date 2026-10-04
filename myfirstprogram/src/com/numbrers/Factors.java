package com.numbrers;
import java.util.*;
//input =6
//output=1,2,3,6

public class Factors {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println("factors : "+ i);
				
				
			}
		}
		System.out.println("main method ended");
		sc.close();

	}

}
