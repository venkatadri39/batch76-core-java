package com.javaintro;
import java .util.*;


class DemoMethod {

static  int calculatePercentage(int marks, int totalmarks) {
	int percentage= (marks *100)/totalmarks;
	return percentage;
	
	
		

	  
  }

    public static void main(String[] args) {
    	
Scanner sc = new Scanner(System.in);
System.out.println("enter the marks");
int m = sc.nextInt();
System.out.println("enter the total marks");
int tm = sc.nextInt();
int percentage =   calculatePercentage(m,tm);
System.out.println("percentage  : " + percentage);
    }
}

