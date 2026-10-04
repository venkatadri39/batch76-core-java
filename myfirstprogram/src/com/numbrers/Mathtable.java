package com.numbrers;
import java. util.*;
//input=9
//output=
//9x1=9
//9x2=18

public class Mathtable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n1 =  sc.nextInt();
		System.out.println("enter the number up to where you want  to print :");
		int n2=sc.nextInt();
		for(int i=1;i<=n2;i++) {
			System.out.println(n1 +" x "  + i +" = " +(n1*i));
		
	
		
		}	
		sc.close();
	

	}
	}
