package com.numbrers;
import java.util.*;
//fibnoseries :0 1 1 2 3 5 8 13

public class Fibnoseries {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("how  many values  you want to print");
	int n =sc.nextInt();
	int n1=0;
	int n2=1;
	int n3=0;
	System.out.print(n1+ " " + n2);
	for(int i=1;i<=n-2;i++) {
		n3=n1+n2;
		System.out.print(" "+ n3);
		n1=n2;
		n2=n3;
		
	}
	sc.close();
	// fibnoseries 0,1------default value
	
//n3=n1+n2
	//n1=n2;
	//n2=n3
	}

}
