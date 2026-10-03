package com.javaintro;
import java .util.*;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number : ");
		int n = sc.nextInt();
		if (n % 3 == 0 && n % 5== 0 ) {
			System.out.println("fizz buzz");
		}
		else if (n % 3 == 0) {
			System.out.println("fizz");
		}
		else if (n % 5 == 0) {
			System.out.println("buzz");
		}
		else {
			System.out.println("not divisble by 3 and 5");
		}

	}

}
