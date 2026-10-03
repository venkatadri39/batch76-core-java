package com.arrays;

public class Countpnz {

	public static void main(String[] args) {
		int [] arr= {10,-5,20,-2,0,15};
		int postiveCount=0;
		int negativeCount=0;
		int zeroCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				postiveCount++;
			
			
				
			}
			
			else if(arr[i] <0) {
				negativeCount++;
			
			}
			else {
				zeroCount++;
			}	
			
			}
			System.out.println("postivecount : "+ postiveCount);
			System.out.println("negativecount : " + negativeCount);
			System.out.println("zerocount "+ zeroCount);
			
		

	}

}
