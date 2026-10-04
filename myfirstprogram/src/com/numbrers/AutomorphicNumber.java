package com.numbrers;
import java.util.*;
// AM:A number is called an automorphicnumber if its square with original number
// example:25;
//25*25=625;
public class AutomorphicNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number :");
		int n = sc.nextInt();
		int temp=n;
		int square=n*n;
		if(square%100==temp) {
			System.out.println("automorphicnumber");
			
		}
		else {
			System.out.println("not automorphicnumber");
		}
		sc.close();
		

	}

}
