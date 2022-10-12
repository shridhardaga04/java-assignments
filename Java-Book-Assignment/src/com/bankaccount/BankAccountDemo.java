package com.bankaccount;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount peteAccount = new BankAccount("Pete");

        System.out.println("Deposit 10000 to pete account");
        peteAccount.deposit(1000);
        System.out.println("Owner : "+peteAccount.getOwner() + "\tBalance : "+ peteAccount.getBalance());

        System.out.println();

        System.out.println("Withdraw 60000 from Pete account");
        peteAccount.withdraw(6000);
        System.out.println("Owner : "+peteAccount.getOwner() + "\tBalance : "+ peteAccount.getBalance());

    }
}
