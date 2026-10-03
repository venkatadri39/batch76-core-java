package com.javaintro;
import java .util.*;

public class SwapNumbers1 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter a value :");
int a = sc.nextInt();
System.out.println("enter b value :");
int b = sc.nextInt();
int temp=0;
temp=a;
a= b;
b=temp;
System.out.println("enter a value : " + a);
System.out.println("enter b value : " + b);
sc.close();


	}

}
