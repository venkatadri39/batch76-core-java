package com.javaintro;
import java .util.*;

public class MultiplicationNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System .out.println("enter the number  to proceed : ");
		int n1= sc.nextInt();
		System.out.println("enter the number upto want where you want print ");
		int n2 = sc.nextInt();
		for(int i=1;i<= n2; i++)
		System.out.println(n1 + " x " + i + " = " + (n1*i));
	sc.close();
		
		
	

	}

}
