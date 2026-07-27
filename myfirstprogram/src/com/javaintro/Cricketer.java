package com.javaintro;

public class Cricketer {
	int jersyNo;
	String cricketerName;
	int age;
	static int countryId;
	static String countryName;


	public static void main(String[] args) {
		System.out.println("Welcome to indian cricket team info");
		countryId = 86;
		countryName = "india";
		
		
		System.out.println("CountryId");
		System.out.println(countryName);
		Cricketer cr = new Cricketer();
		cr.jersyNo = 18;
		cr.cricketerName = "virat";
		System.out.println(cr.jersyNo );
		System.out.println(cr.cricketerName);
		


	}

}
