package com.javaintro;
import java.util.*;

public class Pizza {
	
	 static double getpizzaprice(char size) {
		if(size =='S' ||size == 's') {
			return 70;
			
		}
		else if (size == 'M' || size =='m') {
			return 100;
		}
		else if(size == 'L' || size == 'l') {
			return 150;		}
		
	}
}e
	 
	 
	double calculatepizzacost(double price, int quanity) {
		double totalpizza = price *quanity;
		return totalpizza;
	}
	double calucatedelivarycharge(double distance) {
	if(distance >=0  && distance <= 10) {
		return 70;
	}
	else if(distance >10 && distance <= 20) {
		return 100;
	}
	else {
		return 150;
	}
	}

	double calculatefinalbil(double totalpizza, double delivarycharge) {
		return totalpizza + delivarycharge;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a pizza size (S/M/L) : ");
		char size = sc.next().charAt(0);
		System.out.println("enter the quanity : ");
		int quanity = sc.nextInt();
		
		System.out.println("enter  a distance : ");
		double distance = sc.nextDouble();
	

	}

}
