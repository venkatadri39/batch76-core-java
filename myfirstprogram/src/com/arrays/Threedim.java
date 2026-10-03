package com.arrays;

public class Threedim {

	public static void main(String[] args) {
		int [][][] arr = new int[3][3][3];
		arr[0][0][0]=100;
		arr[1][1][1]=200;
		arr[2][2][2]=300;
		for( int [][] a1:arr) {
			for(int []a2 :a1) {
				for(int a3:a2) {
					System.out.print(a3 + "  ");
				}
				System.out.println();
				
			}
			System.out.println();
		}

	}

}
