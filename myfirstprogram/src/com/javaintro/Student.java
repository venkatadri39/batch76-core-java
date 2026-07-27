package com.javaintro;

public class Student {

	public static void main(String[] args)  throws ClassNotFoundException {
		System.out.println("welcome to java world");
		System.out.println(Class.forName("com.javaintro.Welcome"));
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));
	}
}