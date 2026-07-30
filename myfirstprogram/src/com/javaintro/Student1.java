package com.javaintro;

public class Student1 {
	int studentId;
	String studentName;
	int englishMarks;
	int telugeMarks;
	int hindiMarks;
	int totalMarks;
	double percentage;
	static String collegeName = "chiatanya bharthi institue of techonology";
	void calculateTotal() {
		
		totalMarks = englishMarks + telugeMarks + hindiMarks;
		
	}
	void calculatePercentage() {
		percentage = totalMarks / 3.0;
	}
	
	void displayStudent() {
		System.out.println("collegeName : " + collegeName);
		System.out.println("studentId : " + studentId);
		System.out.println("studentName :"+ studentName);
		System.out.println("englishMarks :" + englishMarks);
		System.out.println("hindiMarks : "+ hindiMarks);
		System.out.println("telugeMarks : " + telugeMarks);
		System.out.println("totalmarks :" + totalMarks );
		System.out.println("percentage : " + percentage);
		
		
		
	}
	

	public static void main(String[] args) {
		
		Student1 s1 = new Student1();
		s1.studentId = 101;
		s1.studentName = "simhadri";
		s1.englishMarks = 96;
		s1.hindiMarks = 84;
		s1.telugeMarks = 98;
		s1. calculateTotal();
		s1. calculatePercentage();
		
		Student1 s2 = new Student1();
		s2.studentId = 102;
		s2.studentName = "venkatadri";
		s2.englishMarks = 87;
		s2.hindiMarks = 86;
		s2.telugeMarks = 99;
		s2.calculateTotal();
		s2.calculatePercentage();
		s1. displayStudent();
		s2.displayStudent();
		
	
		
		
		
		// TODO Auto-generated method stub

	}

}
 