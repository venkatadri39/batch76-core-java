package com.arrays;

public class Minmum {

	public static void main(String[] args) {
		int [] arr= {10,45,23,66,2};
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]< min) {
				min=arr[i];
				
				
			}
			
		}
		System.out.println("minum: "+ min);
		

	}

}
