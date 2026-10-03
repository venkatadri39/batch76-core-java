package com.arrays;
import java.util.*;
public class Sizearray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		System.out.println("enter array size: ");
		int size = sc.nextInt();
		int [] arr=new int [size];
		System.out.println("enter the elements for the array :");
		for(int i=0;i<size; i++) {
		arr[i]=sc.nextInt();
			
		}
		System.out.println(Arrays.toString(arr));
		
		
	

	}

}
