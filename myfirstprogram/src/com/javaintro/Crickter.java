package com.javaintro;

public class Crickter {
	static int countryId;
	static String countryName;
	int jersyNo;
	String crickterName;

	public static void main(String[] args) {
		System.out.println("method is started");
		System.out.println("welcome to indian info");
		countryId=76;
		countryName="india";
		System.out.println("countryId : " + countryId);
		System.out.println("countryName : " + countryName);
		Cricketer vk = new Cricketer();
		vk.jersyNo = 18;
		vk.cricketerName = "viratkohil";
		System.out.println("vk.jersyNo : " + vk.jersyNo);
		System.out.println("vk.cricketerName : " + vk.cricketerName  );
		Cricketer  sr = new Cricketer();
		sr.jersyNo = 96;
		sr.cricketerName = "SheyerIyer";
		System.out.println("sr.jersyNo : " + sr.jersyNo );
		System.out.println("sr.cricketerName : " + sr.cricketerName);
		
		

	}

}
