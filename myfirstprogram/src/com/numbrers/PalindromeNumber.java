package com.numbrers;
import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		int original =n;
		int rev=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		if(original==rev) {
			System.out.println("give number is palindrome ");
		}
		else {
			System.out.println("given number is not palindrome");
		}
		sc.close();
	

	}

}
