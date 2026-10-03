package com.javaintro;
import java.util.*;
public class SwapNumbers {
	

	public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
	System.out.println("enter a number :");
	int a = sc.nextInt();
	System.out.println("enter b number");
	int b = sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("enter a the value :" + a);
	System.out.println("enter  b the value : " + b);
	
	sc.close();
	
	
	

	}

}
