package com.javaintro;


	public class Libray {

	    int bookId;
	    String bookTitle;
	    String authorName;
	    int availableCopies;

	    static String libraryName = "Central Library";
	    static String librarianName = "Manoj";

	    void displayBookDetails() {
	        System.out.println("Book Id          : " + bookId);
	        System.out.println("Book Title       : " + bookTitle);
	        System.out.println("Author Name      : " + authorName);
	        System.out.println("Available Copies : " + availableCopies);
	        System.out.println();
	    }

	    void issueBook() {
	        availableCopies--;
	        System.out.println("Book Issued Successfully");
	        System.out.println("Available Copies : " + availableCopies);
	    }

	    static void displayLibraryDetails() {
	        System.out.println("Library Name   : " + libraryName);
	        System.out.println("Librarian Name : " + librarianName);
	    }

	    static void changeLibrarian() {
	        librarianName = "Ram";
	    }

	    public static void main(String[] args) {

	        Libray lib1 = new Libray();
	        lib1.bookId = 101;
	        lib1.bookTitle = "News";
	        lib1.authorName = "Ganesh";
	        lib1.availableCopies = 10;

	        Libray lib2 = new Libray();
	        lib2.bookId = 102;
	        lib2.bookTitle = "Political";
	        lib2.authorName = "Kumar";
	        lib2.availableCopies = 5;

	        System.out.println("Before Issuing Books");
	        lib1.displayBookDetails();
	        lib2.displayBookDetails();

	        lib1.issueBook();
	        lib2.issueBook();

	      Libray.changeLibrarian();

	        System.out.println("\nLibrary Details");
	        displayLibraryDetails();

	        System.out.println("\nAfter Issuing Books");
	        lib1.displayBookDetails();
	        lib2.displayBookDetails();
	    
	
	
		
	}
	}


