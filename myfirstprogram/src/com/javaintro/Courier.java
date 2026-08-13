package com.javaintro;

public class Courier {
	String customerName;
	int noofCouriers;
	String source;
	String destination;
	float weight;
	double delivaryAmount;
	static int totalCouriers;
	static float totalWeight;
	static double totalamountCollected;
	static int pricePerkg = 100;

	static void display() {
		System.out.println("welcome to quick shop courier ");

	}

	void displayDeatils() {
		System.out.println("customerName : " + customerName);
		System.out.println("noofCouriers : " + noofCouriers);
		System.out.println("source :" + source);
		System.out.println("destination : " + destination);
		System.out.println("weight : " + weight);
		System.out.println("delivaryAmount : " + delivaryAmount);

	}

	void bookCourier() {
		delivaryAmount = (noofCouriers * weight) * pricePerkg;
		totalCouriers = totalCouriers + noofCouriers;
		totalWeight = totalWeight + weight;
		totalamountCollected = totalamountCollected + delivaryAmount;
	}

	static void displaytodayCollection() {
		System.out.println("totalcourierbooked :" + totalCouriers);
		System.out.println("totalWeight : " + totalWeight);
		System.out.println("totalamountCollected :" + totalamountCollected);

	}

	public static void main(String[] args) {

		Courier c = new Courier();
		c.customerName = "venkatdri";
		c.noofCouriers = 5;
		c.source = "mkd";
		c.destination = "jmd";
		c.weight = 20;

		c.bookCourier();
		c.displayDeatils();
		Courier.displaytodayCollection();
		System.out.println("before");

	}

}
