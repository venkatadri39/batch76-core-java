package com.arrays;

public class ReversetwoDim {

	public static void main(String[] args) {
	String [][] names= new String[3][3];
	names[0][0]="simhadri";
	names [0][1]="venkatadri";
	names[0][2]="manoj";
	names [1][0]="obaiah";
	names[1][1]="harish";
	names[1][2]="seaker";
	names[2][0]="venky";
	names[2][1]="ravi";
	names[2][2]="mahesh";
	for(String [] n1:names) {
		for(String n2:n1) {
			System.out.print(n2+ " ");	}
		
	
	System.out.println();
	}
	}

}
