package com.javaintro;

import java.util.Scanner;

public class ArthmaticMethods {

    int addition(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

    int multiplication(int a, int b) {
        return a * b;
    }

    int division(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value:");
        int num1 = sc.nextInt();

        System.out.println("Enter b value:");
        int num2 = sc.nextInt();

        ArthmaticMethods obj = new ArthmaticMethods();

        int result1 = obj.addition(num1, num2);
        System.out.println("Addition = " + result1);

        int result2 = obj.subtraction(result1, num2);
        System.out.println("Subtraction = " + result2);

        int result3 = obj.multiplication(result2, num2);
        System.out.println("Multiplication = " + result3);

        int result4 = obj.division(result3, num2);
        System.out.println("Division = " + result4);

        sc.close();
    }
}