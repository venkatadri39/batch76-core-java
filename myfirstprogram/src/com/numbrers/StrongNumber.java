package com.numbrers;
import java.util.*;
//strong number :A number is called strong number when the sum of the factorails of its digits equals original number
//exmple:145
//1!+4!+5
//1+24+120=145
public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number: ");
		int n =sc.nextInt();
		int temp=n;
		int sum=0;
		while(n>0) {
			int digit=n%10;
			int fact=1;
			for(int i=1; i<=digit;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			n= n/10;
		}
		if(sum==temp) {
			System.out.println("strong number");
		}
		else {
			System.out.println("not strong number");
		}
		sc.close();
		

	}

}
