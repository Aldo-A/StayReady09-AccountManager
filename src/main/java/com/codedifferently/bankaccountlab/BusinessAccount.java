package com.codedifferently.bankaccountlab;

public class BusinessAccount extends BankAccount {
    private String companyName;
    private int taxID;

    public BusinessAccount(Double intialDeposit, String name,int taxID) {
        super(intialDeposit);
        setCompanyName(name);
        setTaxID(taxID);
    }

    public void setCompanyName(String name) {
        this.companyName=name;

    }

    public String getCompanyName(){
        return this.companyName;
    }

    public void setTaxID(int taxID){
        this.taxID=taxID;
    }

    public int getTaxID(){
        return this.taxID;
    }

    @Override
    public Double getFees() {
        return 5.0;
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
