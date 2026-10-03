package com.arrays;

public class JaggedArray {

	public static void main(String[] args) {
		int [] [] arr= new int[2][];
		System.out.println(arr);
		System.out.println(arr[0]);
		arr[0]=new int[3];
		arr[1]=new int[2];
		arr[0][0]=100;
		arr[0][1]=200;
		arr[0][2]=300;
		arr[1][0]=500;
		arr[1][1]=600;
		//for(int [] a1:arr) {
		//	for(int a:a1) {
		//	System.out.print(a+" ");
		//}
			//System.out.println();
		
		//}	
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
