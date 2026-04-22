package com.bank;

public class Bank {

    public int deposit(int balance, int amount) {
        return balance + amount;
    }

    public int withdraw(int balance, int amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        return balance - amount;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank.deposit(100, 50));
    }
}
