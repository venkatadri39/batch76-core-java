package com.arrays;

public class ProductArray {

	public static void main(String[] args) {
		int [] arr= {1,4,6,7,2};
		int product=1;
		for(int i=1; i<arr.length; i++) {
			product= product*arr[i];
		}
		System.out.println("product : " + product);

	}

}
