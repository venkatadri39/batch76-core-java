package com.javaintro;

public class TestDe {
	static void methodadd() {
		int a = 30;
		int b = 32;
		
		System.out.println("a + b ");
	}
	static void method2() {
    	TestDe t = new TestDe();
    	t.method3();

		System.out.println("method called2");
	}
		
    	void method3() {
    	
    		System.out.println("method called3");
    	}
    	void method4() {
    		System.out.println("method called4");
    	}

    	
    	
public static void main(String[] args) {
	System.out.println("method staretd");
	method1();

	
	

	}

}
