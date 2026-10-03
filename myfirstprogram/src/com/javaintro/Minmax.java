
package com.javaintro;

public class Minmax {

	public static void main(String[] args) {
		int [] arr = {8,9,5,1,4};
		int min = arr[0];
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]< min) {
				min = arr[i];
				
			}
			else if(arr[i]>max) {
				max= arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		

	}

}
