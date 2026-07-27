package com.javaintro;

public class Bank {

    static String bankName = "State Bank of India";

    int accountNumber;
    int balance;

    void deposit() {
        balance = balance + 1000;
        System.out.println("After amount deposited : " + balance);
    }

    void withdraw() {
        balance = balance - 500;
        System.out.println("After amount withdrawn : " + balance);
    }

    void checkBalance() {
        System.out.println("Current Balance : " + balance);
    }

    public static void main(String[] args) {

        // First Object
        Bank customer1 = new Bank();
        customer1.accountNumber = 1001;
        customer1.balance = 5000;

        // Second Object
        Bank customer2 = new Bank();
        customer2.accountNumber = 1002;
        customer2.balance = 8000;

        System.out.println("Bank Name : " + Bank.bankName);

        System.out.println("\n----- Customer 1 -----");
        System.out.println("Account Number : " + customer1.accountNumber);
        customer1.checkBalance();
        customer1.deposit();
        customer1.withdraw();

        System.out.println("\n----- Customer 2 -----");
        System.out.println("Account Number : " + customer2.accountNumber);
        customer2.checkBalance();
        customer2.deposit();
        customer2.withdraw();
    }
}} 
