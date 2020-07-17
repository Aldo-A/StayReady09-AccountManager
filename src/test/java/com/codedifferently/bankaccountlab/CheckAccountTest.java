package com.codedifferently.bankaccountlab;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckAccountTest {

    Double balance=3992.02;
    String name="Joe";
    boolean activated=true;
    CheckAccount check;
    @Before
    public void setUp(){
        check=new CheckAccount(balance,name);
    }

    @Test
    public void constructorTest(){
        // Given

        // When
        String actualName=check.getName();
        Double actualBalance=check.getBalance();
        Integer actualID=check.getID();
        boolean actualActivated= check.isActive();
        CheckAccount check2=new CheckAccount(balance,name);
        int otherID=check2.getID();

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
        String actualName=check.getName();

        // Then
        Assert.assertEquals(name,actualName);

    }

    @Test
    public void getBalanceTest(){
        // Given

        // When
        Double actualBalance=check.getBalance();

        // Then
        Assert.assertEquals(balance,actualBalance);

    }

    @Test
    public void getIDTest(){
        // Given

        // When
        Integer actualID=check.getID();
        CheckAccount check2=new CheckAccount(balance,name);
        int otherID=check2.getID();

        // Then
        Assert.assertNotSame(actualID,otherID);

    }

    @Test
    public void deleteAccountTest(){
        // Given
        boolean closed=false;

        // When
        check.closeAccount();
        boolean actualActivated= check.isActive();

        // Then
        Assert.assertEquals(closed,actualActivated);

    }

    @Test
    public void getFeeTest(){
        // Given
        Double expected=97.80;

        // When
        Double actual=check.getFees();

        // Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setNameTest(){
        // Given
        String expected="Rob";

        // When
        check.setName(expected);
        String actualName=check.getName();

        // Then
        Assert.assertEquals(expected,actualName);

    }

    @Test
    public void depositTest(){
        // Given
        Double expected=balance+1000.32;

        // When
        check.deposit(1000.32);
        Double actualBalance=check.getBalance();

        // Then
        Assert.assertEquals(expected,actualBalance);

    }

    @Test
    public void withdrawTest(){
        // Given
        Double expected=balance-1000.32;

        // When
        check.withdraw(1000.32);
        Double actualBalance=check.getBalance();

        // Then
        Assert.assertEquals(expected,actualBalance);

    }

}
