package com.codedifferently.bankaccountlab;

public class CheckAccount extends BankAccount {
    private String name;

    public CheckAccount(Double intialDeposit, String name) {
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

    @Override
    public Double getFees() {
        return 97.80;
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
