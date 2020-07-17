package com.codedifferently.bankaccountlab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SavingsAccountTest {
    Double balance=10000.32;
    String name="Bob";
    boolean activated=true;
    SavingsAccount savings;
    @Before
    public void setUp(){
        savings=new SavingsAccount(balance,name);
    }

    @Test
    public void constructorTest(){
        // Given

        // When
        String actualName=savings.getName();
        Double actualBalance=savings.getBalance();
        Integer actualID=savings.getID();
        boolean actualActivated= savings.isActive();
        SavingsAccount savings2=new SavingsAccount(balance,name);
        int otherID=savings2.getID();

        // Then
        Assert.assertEquals(name,actualName);
        Assert.assertEquals(balance,actualBalance);
        Assert.assertEquals(activated,actualActivated);
        Assert.assertNotSame(actualID,otherID);

    }

    @Test
    public void getNameTest(){
        // Given

        // When
        String actualName=savings.getName();

        // Then
        Assert.assertEquals(name,actualName);

    }

    @Test
    public void getBalanceTest(){
        // Given

        // When
        Double actualBalance=savings.getBalance();

        // Then
        Assert.assertEquals(balance,actualBalance);

    }

    @Test
    public void getIDTest(){
        // Given

        // When
        Integer actualID=savings.getID();
        SavingsAccount savings2=new SavingsAccount(balance,name);
        int otherID=savings2.getID();

        // Then
        Assert.assertNotSame(actualID,otherID);

    }

    @Test
    public void deleteAccountTest(){
        // Given
        boolean closed=false;

        // When
        savings.closeAccount();
        boolean actualActivated= savings.isActive();

        // Then
        Assert.assertEquals(closed,actualActivated);

    }

    @Test
    public void getRateTest(){
        // Given
        Double expected=0.06;

        // When
        Double actual=savings.getRate();

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void getFeesTest(){
        // Given
        Double expected=0.0;

        // When
        Double actual=savings.getFees();

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setNameTest(){
        // Given
        String expected="Rob";

        // When
        savings.setName(expected);
        String actualName=savings.getName();

        // Then
        Assert.assertEquals(expected,actualName);

    }

    @Test
    public void depositTest(){
        // Given
        Double expected=balance+1610.01;

        // When
        savings.deposit(1610.01);
        Double actualBalance=savings.getBalance();

        // Then
        Assert.assertEquals(expected,actualBalance);

    }

    @Test
    public void withdrawTest(){
        // Given
        Double expected=balance-8.32;

        // When
        savings.withdraw(8.32);
        Double actualBalance=savings.getBalance();

        // Then
        Assert.assertEquals(expected,actualBalance);

    }
}
