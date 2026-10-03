package com.javaintro;

public class Constructor1 {
int eid;
String ename;
double salary;
Constructor1(){
	this(101,"simha",7000.0);
	System.out.println("no arg constructor")	;
}
Constructor1(int eid, String ename,double salary){
	this.eid=eid;
	this.ename=ename;
	this.salary=salary;
	System.out.println("paramerized constructor");

}
void show() {
	System.out.println(eid);
	System.out.println(ename);
	System.out.println(salary);
}

	public static void main(String[] args) {
		Constructor1 c = new Constructor1();
	c.show();

	}

}
