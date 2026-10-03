package com.javaintro;
import java .util.*;

public class Factors {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int n = Sc.nextInt();
		findfactorial(n);
		Sc.close();
		
	

	}
	 static  void findfactorial(int n){
		for(int i =1; i<=n; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}
	 

}
