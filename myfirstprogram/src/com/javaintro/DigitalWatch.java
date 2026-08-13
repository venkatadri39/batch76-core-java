package com.javaintro;

public class DigitalWatch {
	String brandName;
	String watchType;
	int hours;
	int mintues;
	int seconds;
	int price;
	void displayTime() {
		System.out.println("brandName : " + brandName);
		System.out.println("watchType : " + watchType);
		System.out.println("price : " + price);
		System.out.println("HH : MM: SS " + hours + " : "+ mintues + " :" + seconds );
	}
	void updateHour() {
		hours=  hours + 1;
		System.out.println("update hours");
	}
	void updateMintues() {
		mintues = mintues +5;
		System.out.println("upate mintues");
	}
	void upadateSeconds() {
		seconds=seconds +10;
	}
			 public static void main(String[] args) {
	DigitalWatch d = new DigitalWatch();
	d.brandName="rolex";
	d.watchType="high";
	d.hours =8;
	d.mintues= 45;
	d.seconds=34;
	d.price=2000;
	d.updateHour();
	d.updateMintues();
	d.upadateSeconds();
	d.displayTime();
	System.out.println("************************");
	DigitalWatch d1 = new DigitalWatch();
	d1.brandName ="abcd";
	d1.watchType ="low";
	d1.hours = 4;
	d1.mintues =25;
	d1.seconds=40;
	d1.price=7000;
	d1.updateHour();
	d1.updateMintues();
	d1.upadateSeconds();
	d1.displayTime();
	
	

	}

}
