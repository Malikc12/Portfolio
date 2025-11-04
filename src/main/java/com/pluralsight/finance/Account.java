package com.pluralsight.finance;

public class Account {

    private String name;
    private Sting accountNumber;
    private double balance;

    public Account(String name, Sting accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public abstract double getValue();
}
