package com.javaintro;

public class Constructor {
	
 String brand;
 String model;
 float price;
 Constructor(String a, String b, float c){
	 brand =a;
	 model= b;
	 price =c;
 }
 void display() {
	 System.out.println("brand : " + brand);
	 System.out.println("model : " + model);
	 System.out.println("price : " + price);
 }
	 
	 
	 
 

	 
	
	public   static  void main(String[] args) {
		System.out.println("main method ended ");
		 Constructor c = new  Constructor("svmsung","high",500000);
		 Constructor c1 = new Constructor("iphone", "low", 49000);
		 c.display();
		 c1.display();
		
		 
		
				 
		
		
		
	 System.out.println("main method ended");
	
		
		
		

	}

}
