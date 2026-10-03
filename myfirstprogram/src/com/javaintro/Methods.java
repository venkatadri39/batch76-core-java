package com.javaintro;
import java.util.*;

public class Methods {

	public static void main(String[] args) {
	System.out.println("enter student id");
	Scanner sc = new  Scanner (System.in);
	int id =  sc.nextInt();
	System.out.println("enter name");
	String sname = sc.next();
	studentinfo(id,sname);
	
	

	}
	static void studentinfo( int id,String sname) {
		System.out.println("studentid : " + id);
		System.out.println("studentname : " + sname);
	}

	}
