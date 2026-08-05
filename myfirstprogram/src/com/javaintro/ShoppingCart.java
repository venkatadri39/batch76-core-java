package com.javaintro;

public class ShoppingCart {
	int items;
	double totalAmount;
	String orderPlaced;
	static String website = "PIZZAHURT";
	void addItem() {
		items++;
		System.out.println("item added  succesfully");		
	}
	void orderPlaced() {
		orderPlaced = "placed";
		System.out.println("placed added succesfully");
		
	}
	void displayCart() {
		System.out.println("website :" + website);
		System.out.println("items :" + items);
		System.out.println("totalamount :" + totalAmount);
		System.out.println("orderplaced :" + orderPlaced);
	}
	static void changeWebsite() {
		website = "Restarunt";
		System.out.println("website changed in succesfully");
	}
	static void displayWebsite() {
		System.out.println("website :" + website);
	}		
		public static void main(String[] args) {
			ShoppingCart s1 = new ShoppingCart();
			s1.items = 1;
			s1.totalAmount =200.40;
			s1.orderPlaced= "not placed";
			ShoppingCart s2 = new ShoppingCart();
			s2.items=2;
			s2.totalAmount=400.97;
			s2.orderPlaced="placed";
			ShoppingCart.displayWebsite();
			System.out.println("before opertions");
			s1.displayCart();
			s2.displayCart();
	        s1.orderPlaced();
		    s2.addItem();
		   
		   ShoppingCart.changeWebsite();
		   ShoppingCart.displayWebsite();
		   System.out.println("after operations");
		   s1.displayCart();
			s2.displayCart();
			
		 
		  
//		  
		   
		   
			
		
	

	}

}
