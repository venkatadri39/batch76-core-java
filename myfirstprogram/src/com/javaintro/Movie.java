package com.javaintro;

public class Movie {
	String movieName;
	int releasedYear;
	double ticketPrice;

	public static void main(String[] args) {
Movie m1 = new Movie();		
m1.movieName = "pushapa";
m1.releasedYear = 2024;
m1.ticketPrice = 550.0;
Movie m2 = new Movie();
m2.movieName = "salar";
m2.releasedYear = 2023;
m2.ticketPrice = 450.0;
Movie m3 = new Movie();
m3.movieName = "hello";
m3.releasedYear = 2020;
m3.ticketPrice = 600.0;
System.out.println("Movie1");
System.out.println("movieName : " + m1.movieName);
System.out.println("releasedYear : " + m1.releasedYear);
System.out.println("ticketPrice : " + m1.ticketPrice);
System.out.println("Movie2");
System.out.println("movieName : " + m2.movieName);
System.out.println("releasedYear : " + m2.releasedYear);
System.out.println("ticketPrice : " + m2.ticketPrice);
System.out.println("Movie3");
System.out.println("movieName : " + m3.movieName);
System.out.println("releasedYear : " + m3.releasedYear);
System.out.println("ticketPrice : " + m3.ticketPrice);




	}

}
