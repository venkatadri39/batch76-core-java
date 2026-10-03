package com.javaintro;

public class Method3 {
	 void display1() {
		System.out.println("method called1 ");
		display2();
		}
	 void  display2() {
	System.out.println("method called 2");
	
	
	
	

	}
	  void  display3() {
		System.out.println("method called 3");
	}
	  void display4() {
		  System.out.println("method called 4");
		  display1();
	  }

	  
	public static void main(String[] args) {
		Method3 m = new Method3();
		m.display4();
	

	}

}
