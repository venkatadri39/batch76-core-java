package com.javaintro;

public class Restaurant {
	static String restaurntName = "Abhiruchi";
	int tableNumber;
	int seats;
	boolean reserved;
	void reserveTable() {
		reserved = true;
		System.out.println("if table is reserved");
	}
	void cancelReservation() {
		reserved = false;
		System.out.println("if table is cancel");
		
	}
 void displaytableDetails() {
	 System.out.println("restaurntName : " + restaurntName);
	 System.out.println("tableNumber : " + tableNumber);
	 System.out.println("seats : " +  seats);
	 System.out.println("reserved :" + reserved);
 }
 static void  changerestaurntName ()  {
	 restaurntName = "redbucket";
	 System.out.println("restarunt name is changed succesfully");
 }
  static void displayRestaurntName() {
	 System.out.println("restaurntName : " + restaurntName );
 }
	 
 public static void main(String[] args) 
 {
	 Restaurant r1 = new 	 Restaurant();
	 r1.tableNumber = 1;
	 r1.seats = 5;
	 r1.reserved =  true;
	 Restaurant  r2 = new  Restaurant();
	 r2.tableNumber =2;
	 r2.seats = 4;
	 r2.reserved  = false;
	 Restaurant.displayRestaurntName();
	 
	
	
	 
	 System.out.println("before changes");
	r1. displaytableDetails();
    r2. displaytableDetails();
	 r1. reserveTable();
	 r2.cancelReservation();
	 Restaurant.changerestaurntName();
	 
	 System.out.println("after change");
	
	  
	    r1. displaytableDetails();
	    r2. displaytableDetails();
 }
}
