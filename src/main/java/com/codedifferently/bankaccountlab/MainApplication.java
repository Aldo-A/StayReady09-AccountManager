package com.codedifferently.bankaccountlab;

import java.util.HashMap;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        HashMap<String,Object> accounts=new HashMap<String, Object>();
        menu();
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();
        while(choice!=5){
            if(choice==1){
                System.out.println();
            }
            else if(choice==2){

            }
            else if(choice==3){

            }
            else if(choice==4){

            }
            else{
                System.out.println("Enter a valid option");
            }
            menu();
            choice=scan.nextInt();

        }
        System.out.println("Thank you for using Code Bank.");
    }

    static void menu(){
        System.out.println("Welcome to Code Bank.");
        System.out.println("What do you want to do? Enter a number");
        System.out.println("1) Create Checkings Account");
        System.out.println("2) Create Savings Account");
        System.out.println("3) Create Business Account");
        System.out.println("4) Checks account(s)");
        System.out.println("5) Exit");
    }

    static int createPassword(){
        Scanner input=new Scanner(System.in);
        System.out.println("Thank you for creating an account with Code Bank.");
        System.out.println("Please enter a 4 digit pin for your account: ");
        String pass=input.nextLine();
        while(!pass.matches("\\d{4}")){
            System.out.println("Enter a valid 4 digit pin: ");
            pass=input.nextLine();
        }
        return Integer.parseInt(pass);

    }

}
