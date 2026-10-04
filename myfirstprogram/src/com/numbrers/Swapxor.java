package com.numbrers;

public class Swapxor {
//o,1=1;
//0,0=0;
	//1,1=0
	public static void main(String[] args) {
		int a=10;    //  168421----01 0 1 0=10
		int b=20;   //168421------1 0 1 0 0=10
		  a=a^b;
		   b=  a^b;      //--------------------------------------
		                         //1 1 1 0     
     a=a^b;
     System.out.println("A value : "+ a);
     System.out.println("B value : " + b);
     
	}

}
