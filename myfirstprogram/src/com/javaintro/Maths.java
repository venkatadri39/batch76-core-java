package com.javaintro;
import java. util.*;

public class Maths {

	public static void main(String[] args) {
		Maths m = new Maths();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the sides : ");
		double as = sc.nextDouble();
		double a = m.areaSquare(as);
		System.out.println("area : " + a);
		System.out.println("************************");
		System.out.println("enter the length :");
		double l = sc.nextDouble();
		System.out.println("enter the breadth :");
		double b = sc.nextDouble();
		double ar = m.areaRectangle(l, b);
		System.out.println("area rectangle : " + ar);
		System.out.println("*****************************");
		System.out.println("base  : ");
		double be = sc.nextDouble();
		System.out.println("height : ");
		double h = sc.nextDouble();
		double tri = m. areaTriangle(be,h);
		
		System.out.println("triangle : " + tri);
		System.out.println("***************************");
		System.out.println("enter the radius :");
		double r = sc.nextDouble();
		double ra = m.areaCircle(r);
		System.out.println("circle : " + ra);
		System.out.println("*****************************");
	

	}
	
  double areaSquare( double n) {
	  double as= n*n;
	  return as;
  }
  double areaRectangle(double length, double breadth) {
	  double ar = length* breadth;
	  return ar;
  }
  double areaTriangle(double base, double height) {
	  double at = 0.5 *base * height;
	  return at;
  }
  double areaCircle(double r) {
	 double ac = 3.14* r *r;
	 return ac;
  }
}
