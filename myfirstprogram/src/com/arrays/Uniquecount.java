package com.arrays;

public class Uniquecount {

	public static void main(String[] args) {
		int  n[]= {10,20,10,20,30,10,30};
		int count=0;
		for(int i=0;i<n.length;i++) {
			for(int j=0;j<n.length;i++) {
				if(n[i]==n[j]) {
					count++;
					
				}
				System.out.println("count :" + count);
			
				
			}
		
		}
		

	}

}
