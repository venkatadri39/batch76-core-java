package com.javaintro;

public class ReverseArray {

	public static void main(String[] args) {
	int [] numbers= {27,56,89,45,54};
	int rev=0;
	for(int i=numbers.length-1; i>=0;i--) {
		rev= numbers[i];
		System.out.println(rev);
	}

	}

}
