package com.javaintro;

public class Libray {
	int bookId;
	String bookTittle;
	String authorName;
	int availbleCopies;
	static String librayName = "central libray";
	static String  libraianName = "manoj";
	void displayBookdeatails() {
		System.out.println("bookId : " + bookId);
		System.out.println("bookTittle : " + bookTittle);
		System.out.println("availbleCopies : " + availbleCopies);
		
		
		
	}
	void issueBook() {
		availbleCopies = availbleCopies - 1;
		System.out.println("avalibleCopies : " + "avalibleCopies");
	}
		 static void displayLibrayDetails() {
		 System.out.println("librayName : " + "librayName");
		 System.out.println("libraianName : " + libraianName);
		 
		 
		 }
		 static void changeLibrain() {
			  libraianName = "ram";
		 }
		 
		 public static void main(String[] args) {
		Libray lib1 = new Libray();
		lib1.bookId = 101;
		lib1.bookTittle = "news";
		lib1.authorName = "ganesh";
		lib1.availbleCopies = 10;
		Libray lib2 = new Libray();
		lib2.bookId = 102;
		lib2.bookTittle = "political";
		lib2.authorName = "kumar";
		lib2.availbleCopies = 5;
		lib1.displayBookdeatails();
		lib2.displayBookdeatails();
		lib1.issueBook();
		lib2.issueBook();
		changeLibrain();
		displayLibrayDetails();
		lib1.displayBookdeatails();
		lib2.displayBookdeatails();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
