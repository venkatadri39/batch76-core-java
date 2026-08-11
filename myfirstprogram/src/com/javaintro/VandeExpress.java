package com.javaintro;

public class VandeExpress {
	 String PassengerName;
	 int Age;
	 String Source;
	 String Destination;
	 double amount;
	 int NumberofTickets;
	 static double TotalticketBought;
	 static double TotalAmount;
	 static double Price =500;
	 static {
		 System.out.println("welcome  to vande express thanking  for choosing us"); }
	  
	void bookTicket() {
		amount = NumberofTickets*Price;
		TotalticketBought=TotalticketBought+NumberofTickets;
		TotalAmount =TotalAmount +amount; 
		System.out.println("ticket booked succesfully");
		
		
	}
	void DisplaybookDetails() {
		System.out.println("PassengerName: " + PassengerName);
		System.out.println("Age : " + Age);
		System.out.println("Source : " + Source);
		System.out.println("Destination : " + Destination);
		System.out.println( "NumberofTickets : " + NumberofTickets);
		System.out.println("amount : " + amount);
		
	}
	static void TicketCounter() {
		System.out.println("TotalticketBought : " + TotalticketBought);
		System.out.println("TotalTicketBought : " + TotalAmount);
		
	}

	public static void main(String[] args) {
		VandeExpress v = new VandeExpress();
		v.PassengerName="venkat";
		v.Age=20;
		v.Source="jmd";
		v.Destination="mkd";
		v.amount=500;
		v.NumberofTickets=2;
		v.bookTicket();
		v.DisplaybookDetails();
		VandeExpress v1 = new VandeExpress();
		v1.PassengerName="simhadri";
		v1.Age= 23;
		v1.Source="myl";
		v1.Destination="cbit";
		v1.amount= 400;
		v1.NumberofTickets =4;
		v1.bookTicket();
		v1.DisplaybookDetails();
		VandeExpress.TicketCounter();
		
		
		
		
		
		

	}

}
