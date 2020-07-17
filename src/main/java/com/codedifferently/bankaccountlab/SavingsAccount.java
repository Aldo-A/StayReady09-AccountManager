package com.codedifferently.bankaccountlab;

public class SavingsAccount extends BankAccount {
    private String name;

    public SavingsAccount(Double intialDeposit, String name) {
        super(intialDeposit);
        setName(name);
    }

    @Override
    public void setName(String name) {
        this.name=name;

    }

    @Override
    public String getName(){
        return this.name;
    }

    public Double getRate(){
        return 0.06;
    }

    @Override
    public Double getFees() {
        return 0.0;
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }

    @Override
    public Integer getID() {
        return accountNumber;
    }

    @Override
    public void deposit(Double money) {
        this.balance+=money;
    }

    @Override
    public void withdraw(Double money) {
        this.balance-=money;
    }
}
