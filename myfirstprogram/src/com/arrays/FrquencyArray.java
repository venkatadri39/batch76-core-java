package com.arrays;

public class FrquencyArray {
public static void main(String [] args) {
	int [] arr = {10,20,30,10,30,10};
	int count=0;
	int search=10;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==search) {
			count++;
		}
	}
	System.out.println("search :" + search );
	System.out.println("count : "+count);
	

}
}
