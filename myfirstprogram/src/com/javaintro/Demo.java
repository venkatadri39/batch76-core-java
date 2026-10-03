package com.javaintro;
class Demo {
	static String storeName ="simhadri genral store";
	String customerName;
	String productName;
	double price;
	int quanity;
	double finalAmount;
	void addProduct(String pname,double pr,int qua) {
		productName= pname;
		price  = pr;
		quanity = qua;
		System.out.println("product added succesfully");
	}
	void calculateTotal(double discount) {
		double totalprice=price*quanity;
		double discountamount =totalprice*discount/100;
	 finalAmount=totalprice-discountamount;
	}
	void displayCart() {
		System.out.println("storeName : " + storeName);
		System.out.println("customerName : " + customerName);
		System.out.println("productName: " + productName);
		System.out.println("price : " + price);
		System.out.println("quanity : " + quanity);
		System.out.println("finalAmount : " + finalAmount);
		
		
	}
	
 public static void main(String[] args) {
	  System.out.println("main mehod started");
	  Demo d = new Demo();
	  d.customerName = "venkatadri";
	 d.addProduct("laptop",500000,1);
	 d.calculateTotal(10);
	 d.displayCart();
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	 
	  
		 
		 
		 
		
		 
		 
	}

}
