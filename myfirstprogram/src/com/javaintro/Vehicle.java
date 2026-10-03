package com.javaintro;

public class Vehicle{
	String type;
	Vehicle(String type){
		this.type= type;
	}
	
	}
	
	class Car extends Vehicle{
		String brand;
		double price;
		Car( String type,String brand,double price){
			super(type);
			this.brand=brand;
			this.price=price;
	
	
			 class ElectricCar extends Car{
			int batteryCapacity;
			
			
			
			
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}