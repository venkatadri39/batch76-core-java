package com.javaintro;
import java. util.*;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter the marks : ");
		int marks  = sc.nextInt();
		String grade;
		grade = (marks < 0 || marks >100) ? "invaild marks"
		:(marks >= 91 )? " s grade"
		:(marks >= 81)	? " A grade"	
		:(marks >= 71 ) ? " B grade"
		:(marks >= 51)	? " c grade "	
		:(marks >= 41)? " D grade"	
		:(marks >= 35)? " E grade"
				:"failed";
					System.out.println("grade : "+ grade);
		sc.close();
	

	}

}
