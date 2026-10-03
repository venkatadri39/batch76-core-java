package com.arrays;

public class Equlibrim {
	public static void main(String[] args) {
		int [] n= {1,3,5,2,2};
		for(int i=1; i<n.length; i++) {
			int rightsum=0;
			int leftsum=0;
	
		for(int j=i+1; j<n.length;j++) {
		
			
			rightsum+=n[j];
		}
		
			
		for	(int k=i-1; k>=0; k--) {
				leftsum+=n[k];
			}
		if(rightsum==leftsum) {
			System.out.println("index: "+ i);
			System.out.println("element: "+ n[i]);
			
		}
			
			
			
		}
		
	}

}

