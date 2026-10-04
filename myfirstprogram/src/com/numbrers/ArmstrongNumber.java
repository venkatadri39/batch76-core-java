package com.numbrers;
import java.util.*;
// 153=1^3+5^3+3^3=1+125+9=153;
//1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number : ");
		int n =sc.nextInt();
		int original=n;
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+(r*r*r);
			
		}
		if(original==sum) {
			System.out.println("given number is armstrong number");
		}
		else {
			System.out.println("given number is not armstrong number");
		}
		sc.close();
		
	

	}

}
