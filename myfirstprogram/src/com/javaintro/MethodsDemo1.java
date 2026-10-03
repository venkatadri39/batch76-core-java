package com.javaintro;
import java.util.*;

public class MethodsDemo1 {

	public static void main(String[] args) {
		MethodsDemo1 md= new MethodsDemo1();
		Scanner sc = new Scanner(System.in);
		System.out.println("sides : ");
		double s =  sc.nextDouble();
		double  ps = md.perimeterofSquare(s);
		System.out.println("perimeter of square : " + ps);
		System.out.println("*****************");
		System.out.println("enter length : ");
		double l = sc.nextDouble();
		System.out.println("enter breadth");
		double b = sc.nextDouble();
		double pr = md.perimeterofRectangle(l,b);
		System.out.println("perimeterofrectangle : " + pr);
		System.out.println("********************");
		System.out.println("enter the radius : ");
		double r = sc.nextDouble();
		double cc = md.circumsofCircle(r);
		
		System.out.println("circle  : " + cc);
		System.out.println("*******************");
		System.out.println("enter the percentage : ");
		double p = sc.nextDouble();
		System.out.println("enter the rate : ");
		double re= sc.nextDouble();
		System.out.println("enter the time : ");
		double t = sc.nextDouble();
		double prt = md.simpleInterst(p,re,t);
		System.out.println("simpleinterst : " + prt);
		
		
		

	}
	double perimeterofSquare(double sides) {
		double ps = 4 * sides;
		return ps;
	}
	double perimeterofRectangle(double length,double breadth) {
		double pr = 2*(length + breadth);
		return pr;
		
	}
	double circumsofCircle(double radius) {
		double cc = 2 * 3.14 * radius;
		return cc;
	}
	double simpleInterst(double p, double r,double t) {
		double si = (p*r*t)/100;
		return si;
		
	}
	

}
