package com.michael.myjavaproject.accounts;

public class BrokerageAccount {

    private long accountNumber;
    private double balance;

    public BrokerageAccount() {
    }

    public BrokerageAccount(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BrokerageAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void deposit() {


    }
}
