# Account Manager

## Objectives

To demonstrate your understanding of the following:

1. Objects and functions
2. Controlling execution
3. Access control
4. Reusing classes

## Overview

In this lab you will create an ATM-like application that will allow users to create and manage accounts. A class called *BankAccount* has been created for you as well as a class name *Demo.MainApplication*. The *BankAccount* class needs to be abstract class, and will be the base class for three other classes called “CheckingAccount”, “SavingsAccount” and “BusinessAccount”. Manage credits and debits from these accounts through an ATM style program.

## Unit Test

UML is required
Unit test in place before proceeding with code
Make sure you test EVERY public method

## Part 1

Below are the requirements for each class.

**Checking Account**

- Account Number : Allows for unique identification of each account
- Fees : Represents the annual fees for this type of account
- Name : individual name associated with an account
- Balance : the current balance of the account

**Savings Account**

- Account Number : Allows for unique identification of each account
- Fees : Represents the annual fees for this type of account
- Name : individual name associated with an account
- Rate : Represents the annual return on savings
- Balance : the current balance of the account

**Business Account**

- Account Number : Allows for unique identification of each account
- Fees : Represents the annual fees for this type of account
- Company : Company name associated with an account
- Tax Id : Represents the companies tax id number
- Balance : the current balance of the account

Remember to create getter and setter methods to set and retrieve values where appropriate

## Part 2

Use the *Demo.MainApplication* class as the entry point to the ATM. Use the *main()* and *Scanner* to allow the user to interact with your ATM. A user should be able to create, view and delete accounts.

## Part 3

* Allow a user to deposit and debt from their account
* It would be a good idea to also add password protection to the account. Refactor the program to have the user create a password when creating a new account. This password should be required in order to manage the account
