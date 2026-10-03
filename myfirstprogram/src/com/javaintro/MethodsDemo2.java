package com.javaintro;
import java.util.*;

public class MethodsDemo2 {

	public static void main(String[] args) {
		MethodsDemo2 md = new MethodsDemo2();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter price : ");
		int p = sc.nextInt();
		System.out.println("enter quanity  : ");
		int q = sc.nextInt();
		int result  = md. shoppingCart(p,q);
		System.out.println("total amount : " + result);
		System.out.println("****************");
		System.out.println("enter the price : ");
		int pe = sc.nextInt();
		System.out.println("enter the tickets :");
		int t = sc.nextInt();
		int mt = md.movieTicket(pe,t);
		System.out.println("total amount : " + mt);
		
		

	}
	int shoppingCart (int price, int quanity) {
		int sc = price* quanity;
		return sc;
	}
	int movieTicket(int price ,int tickets) {
		int mt = price * tickets;
		return mt;
	}

	

}
