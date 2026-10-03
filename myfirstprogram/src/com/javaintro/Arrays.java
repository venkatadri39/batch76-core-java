package com.javaintro;

public class Arrays {

	public static void main(String[] args) {
System.out.println("main method  started");
int [] numbers = new int [5];
System.out.println(numbers);
numbers[0]=1001;
numbers[1]=1002;
numbers[2]=1003;
numbers[3]=1004;
numbers[4]=1005;

for(int i=0;i<numbers.length; i++) {
	if(numbers[i]%2==1) {
		System.out.println(numbers[i]);
		
	}
	
	
}

	}

}
