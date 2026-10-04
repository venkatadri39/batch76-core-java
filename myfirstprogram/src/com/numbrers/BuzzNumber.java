package com.numbrers;
import java.util.*;
//buzzNumber : its means that  number is divsible by 7 or ends 7

public class BuzzNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter the number : ");
		int n =sc.nextInt();
		if(n%7==0||n%10==7) {
			System.out.println(" buzz number");
			
		}
		else {
			System.out.println(" not  buzz number");
		}
		sc.close();
		

	}

}
