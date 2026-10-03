package com.javaintro;
import java .util.*;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		int sum = digitSum(n);
		System.out.println("sum of the digits : " + sum);
		int count = countsum(n);
		System.out.println("count of the digits : " + count);	

	}
	static int digitSum( int n) {
		int sum =0;
		int r =0;
		while(n>0) {
			r = n%10;
			n= n/10;
			sum= sum + r;
			
		}
		return sum;
	}
	static int countsum(int n) {
		int count =0;
		while(n>0) {
			n = n/10;
			count++;
		}
		return count;
	}

}
