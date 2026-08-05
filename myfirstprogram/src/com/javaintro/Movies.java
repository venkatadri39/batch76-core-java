package com.javaintro;

public class Movies {
	String movieName;
	int seatNumber;
	boolean booked;
	static String movieTheatre = "TPR";

	void bookTicket() {
		 if (!booked) {
	            booked = true;
	            System.out.println("Ticket booked successfully.");
	        } else {
	            System.out.println("Ticket is already booked.");
	        }
	    }

	 void cancelTicket() {
		        if (booked) {
		            booked = false;
		            System.out.println("Ticket cancelled successfully.");
		        } else {
		            System.out.println("Ticket is already available.");
		        }
		    }

	void displayticketDetails() {
		System.out.println("movieName : " + movieName);
		System.out.println("seatNumber : " + seatNumber);
		System.out.println("booked:" + booked);
		System.out.println("movieTheatre: " + movieTheatre);
	}

	static void changeTheratreName() {
		movieTheatre = "TNR";

	}

	void displayTheatreName() {
		System.out.println("movieTheatre: " + movieTheatre);

	}

	public static void main(String[] args) {
		Movies m1 = new Movies();
		m1.movieName = "bahubali";
		m1.seatNumber = 2;
		m1.booked = true;
		m1.bookTicket();
		m1.cancelTicket();
		m1.displayticketDetails();
		Movies m2 = new Movies(); 
		m2.movieName = "RRR";
		m2.seatNumber = 5;
		m2.booked = false;
		m2.bookTicket();
		m2.cancelTicket();
		m2. changeTheratreName();
		m2.displayticketDetails();

	}

}
