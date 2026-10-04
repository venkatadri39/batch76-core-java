package com.numbrers;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		System.out.println(" enter the number :");
		int n = sc.nextInt();
		int r=0;
		int rev=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
			
		}
		System.out.println("reverse number : "+ rev);
sc.close();
	}

}
