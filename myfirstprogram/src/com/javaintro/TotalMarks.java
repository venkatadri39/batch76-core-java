package com.javaintro;

public class TotalMarks {

	public static void main(String[] args) {
		int [] marks= {98,99,95,92,96,91};
		System.out.println(marks);
		int total_marks=0;
		int avg=0;
		for(int i=0;i<marks.length;i++) {
			total_marks= total_marks + marks[i];
		}
		avg = total_marks/marks.length;
		System.out.println(total_marks);
		System.out.println(avg);


}
}
