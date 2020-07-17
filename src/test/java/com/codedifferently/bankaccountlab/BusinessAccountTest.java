package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BusinessAccountTest {
    Double balance=99311300.00;
    String name="McDonalds";
    int taxID=1593293;
    boolean activated=true;
    BusinessAccount bus;
    @Before
    public void setUp(){
        bus=new BusinessAccount(balance,name,taxID);
    }

    @Test
    public void constructorTest(){
        // Given

        // When
        String actualName=bus.getName();
        Double actualBalance=bus.getBalance();
        Integer actualID=bus.getID();
        boolean actualActivated= bus.isActive();
        BusinessAccount bus2=new BusinessAccount(balance,name,391931);
        int otherID=bus2.getID();
        int otherTax=bus.getTaxID();

        // Then
        Assert.assertEquals(name,actualName);
        Assert.assertEquals(balance,actualBalance);
        Assert.assertEquals(activated,actualActivated);
        Assert.assertNotSame(actualID,otherID);
        Assert.assertNotSame(taxID,otherTax);

    }

    @Test
    public void getCompanyNameTest(){
        // Given

        // When
        String actualName=bus.getName();

        // Then
        Assert.assertEquals(name,actualName);

    }

    @Test
    public void getBalanceTest(){
        // Given

        // When
        Double actualBalance=bus.getBalance();

        // Then
        Assert.assertEquals(balance,actualBalance);

    }

    @Test
    public void getIDTest(){
        // Given

        // When
        Integer actualID=bus.getID();
        BusinessAccount bus2=new BusinessAccount(balance,name,3419392);
        int otherID=bus2.getID();

        // Then
        Assert.assertNotSame(actualID,otherID);

    }

    @Test
    public void getTaxIDTest(){
        // Given

        // When
        Integer actualID=bus.getTaxID();
        BusinessAccount bus2=new BusinessAccount(balance,name,3419392);
        int otherID=bus2.getTaxID();

        // Then
        Assert.assertNotSame(actualID,otherID);

    }

    @Test
    public void setTaxIDTest(){
        // Given
        int expected=99999999;
        // When
        bus.setTaxID(expected);
        int actual=bus.getTaxID();

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void deleteAccountTest(){
        // Given
        boolean closed=false;

        // When
        bus.closeAccount();
        boolean actualActivated= bus.isActive();

        // Then
        Assert.assertEquals(closed,actualActivated);

    }

    @Test
    public void getFeeTest(){
        // Given
        Double expected=5.0;

        // When
        Double actual=bus.getFees();

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setCompanyNameTest(){
        // Given
        String expected="Garner co.";

        // When
        bus.setName(expected);
        String actualName=bus.getName();

        // Then
        Assert.assertEquals(expected,actualName);

    }

    @Test
    public void depositTest(){
        // Given
        Double expected=balance+1060.33;

        // When
        bus.deposit(1060.33);
        Double actualBalance=bus.getBalance();

        // Then
        Assert.assertEquals(expected,actualBalance);

    }

    @Test
    public void withdrawTest(){
        // Given
        Double expected=balance-88890.00;

        // When
        bus.withdraw(88890.00);
        Double actualBalance=bus.getBalance();

        // Then
        Assert.assertEquals(expected,actualBalance);

    }
}
