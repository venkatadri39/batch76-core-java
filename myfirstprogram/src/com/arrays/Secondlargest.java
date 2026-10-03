package com.arrays;

public class Secondlargest {

	public static void main(String[] args) {
		int [] arr= {10,23,67,28,50,2,4};
		int evencount=0;
		int oddcount=0;
	
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evencount++;
				
			}
			else {
				oddcount++;
			}
			
		}
		System.out.println("even numbers: "+ evencount);
		System.out.println("odd count: "+ oddcount);
		
		
		
		

	}

}
