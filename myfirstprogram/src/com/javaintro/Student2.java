package com.javaintro;

public class Student2 {
	int id;
	String ename;
	int marks;
	Student2(int id, String  ename,int marks){
		this.id=id;
		this.ename= ename;
		this.marks=marks;
		
	}
	Student2(Student2 obj){
		this.id= obj.id;
		this.ename=obj.ename;
		this.marks=obj.marks;
	}
	void show() {
		System.out.println("id : " + id);
		System.out.println("ename : " + ename);
		System.out.println("marks : " + marks);
	}

	public static void main(String[] args) {
		Student2 s = new Student2(101,"simhadri",98);
		Student2 s1= new Student2(s);
		s.show();
		s1.marks=92;
		
		System.out.println("copy constructor");
		s1.show();
		
		
		
		

	}

}
