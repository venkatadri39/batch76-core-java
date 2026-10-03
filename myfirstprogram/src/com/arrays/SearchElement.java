package com.arrays;

public class SearchElement {

	public static void main(String[] args) {
		int [] arr = {10,20,65,78};
		int search=65;
		for(int i=0;i<arr.length; i++) {
			if(arr[i] == search) {
				System.out.println("elememt found at index : "+ i);
			}
		}
	

	}

}
