package com.codedifferently.bankaccountlab;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class BankAccount {
    protected static AtomicInteger ID=new AtomicInteger();
    protected Integer accountNumber;
    protected Double balance;
    protected Boolean activated;

    public BankAccount(Double intialDeposit){
        this.accountNumber=ID.getAndIncrement();
        this.balance=intialDeposit;
        this.activated=true;
    }

    public void closeAccount(){
        this.activated=false;
    }

    public boolean isActive(){
        return this.activated;
    }

    public abstract String getName();
    public abstract void setName(String name);
    public abstract Double getFees();
    public abstract Double getBalance();
    public abstract Integer getID();
    public abstract void deposit(Double money);
    public abstract void withdraw(Double money);



}
