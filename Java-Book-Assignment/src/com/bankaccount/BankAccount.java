package com.bankaccount;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner) {
        this.owner = owner;
        balance = 0;
    }

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0)
            balance += amount;
        else
            System.out.println("Invalid amount : Amount should be greater than zero");
    }

    public void withdraw(double amount){
        if(amount > 0 && amount < balance)
            balance -= amount;
        else
            System.out.println("Invalid amount : Not sufficient balance or amount should be greater than zero");
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance(){
        return balance;
    }
}
