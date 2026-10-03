
package com.javaintro;
import java .util.*;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();
		int fn = factoraial(n);
		System.out.println("factorial number : " + fn);
	

	}
 static   int 	factoraial(int n) {
	   int fact  =1;
	   for( int i=n; i>=1; i--) {
		   fact = fact *i;
		 
		   
	   }
	   return fact;
   }

}
