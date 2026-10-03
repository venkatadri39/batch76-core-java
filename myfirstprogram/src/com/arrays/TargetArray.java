package com.arrays;
import java.util.*;

public class TargetArray {

	public static void main(String[] args) {
		int [] n= {7,0,1,4,3,6,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the target number");
		int target=sc.nextInt();
		for(int i=0; i<n.length;i++) {
		for(int j=0;j<n.length-1;j++) {
			if(n[i]+n[j]==target&&i!=j) {
				System.out.println(n[i]+ " ," + n[j]);
			}
			
				
			}
			
			
			
		}

	}

}
