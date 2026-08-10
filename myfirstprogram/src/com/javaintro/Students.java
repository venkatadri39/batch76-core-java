package com.javaintro;

public class Students {
	Integer StudentId;
	String StudentName;
	String Gender;
	String BranchName;
	String CollegeName;
	void DisplayStudentDetails() {
		System.out.println("StudentId : " + StudentId);
		System.out.println("StudentName: " + StudentName);
		System.out.println("Gender : " + Gender);
		System.out.println("BranchName: " + BranchName);
		System.out.println("CollegeName : " + CollegeName);
	}
	

	

	public static void main(String[] args) {
		Students s = new Students();
		s.StudentId=101;
		s.StudentName="simhadri";
		s.Gender = "male";
		s.BranchName ="CSE";
		s.CollegeName ="CBIT";
		Students s1 = new Students();
		s1.StudentId =102;
		s1.StudentName="venkatadri";
		s1.Gender = "male";
		s1.BranchName="ECE";
		s1.CollegeName="CBIT";
		s.DisplayStudentDetails();
		s1.DisplayStudentDetails();

	}

}
