package com.javaintro;

public class Count {
	 int count=0;
	Count(){
		count = count+1;
		System.out.println("count called");
		System.out.println("Count : " + count);
		
		
		
	}

	public static void main(String[] args) {
		Count c1= new Count();
		Count c2 = new Count();
		
		

	}

}
