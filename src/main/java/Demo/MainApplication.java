package Demo;

import com.codedifferently.bankaccountlab.BankAccount;
import com.codedifferently.bankaccountlab.BusinessAccount;
import com.codedifferently.bankaccountlab.CheckAccount;
import com.codedifferently.bankaccountlab.SavingsAccount;

import java.util.HashMap;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        // DOES NOT HANDLE WRONG INPUT, EXPECTS CORRECT INPUT TYPE
        HashMap<Integer,BankAccount> accounts=new HashMap<Integer, BankAccount>();
        menu();
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();
        while(choice!=5){
            if(choice==1){
                int password=createPassword();
                accounts.put(password,createCheckingAccount());
                System.out.println("Checking Account Created");
            }
            else if(choice==2){
                int password=createPassword();
                accounts.put(password,createSavingsAccount());
                System.out.println("Savings Account Created");


            }
            else if(choice==3){
                int password=createPassword();
                accounts.put(password,createBusinessAccount());
                System.out.println("Business Account Created");

            }
            else if(choice==4){
                System.out.println("||||| Your Accounts ||||");
                for (Integer pass :
                    accounts.keySet() ) {
                    BankAccount current=accounts.get(pass);
                    System.out.printf("\tID: %d, Account Name: %s\n",current.getID(),current.getName());
                }
                System.out.println("Enter PIN to access desired account(or type any number to exit): ");
                Integer checkPassword=scan.nextInt();
                if(accounts.get(checkPassword)!=null){
                    BankAccount account=accounts.get(checkPassword);
                    System.out.printf("ID: %d\nAccount Name: %s\nBalance: %.2f\n\n",account.getID(),account.getName(),account.getBalance());
                    accountMenu();
                    int accountChoice=scan.nextInt();
                    while(accountChoice!=4){
                        if(accountChoice==1){
                            System.out.println("How much do you want to deposit? ");
                            double money=scan.nextDouble();
                            if(deposit(account,money))
                                System.out.println("Money has been deposited");
                            else
                                System.out.println("An invalid amount was entered, try again.");

                        }
                        else if(accountChoice==2){
                            System.out.println("How much do you want to withdraw? ");
                            double money=scan.nextDouble();
                            if(withdraw(account,money))
                                System.out.println("Money has been withdrawn.");
                            else
                                System.out.println("An invalid amount was entered, try again.");

                        }
                        else if(accountChoice==3){
                            account.closeAccount();
                            accounts.remove(checkPassword);
                            accountChoice=4;
                            System.out.println("Your account has been closed, thank you for using Code Bank.");

                        }
                        else {
                            System.out.println("Enter a valid option");
                        }
                        System.out.printf("ID: %d\nAccount Name: %s\nBalance: %.2f\n\n",account.getID(),account.getName(),account.getBalance());
                        accountMenu();
                        accountChoice=scan.nextInt();
                    }


                }
                else
                    System.out.println("Incorrect PIN, try again.");



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

    static void accountMenu(){
        System.out.println("What do you want to do? Enter a number");
        System.out.println("1) Deposit");
        System.out.println("2) Withdraw");
        System.out.println("3) Close account");
        System.out.println("4) Exit");
    }

    static Integer createPassword(){
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

    static CheckAccount createCheckingAccount(){
        CheckAccount temp=new CheckAccount(null,null);
        System.out.printf("Annual fees: $%.2f\n",temp.getFees());
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter name : ");
        String name=input.nextLine();
        System.out.println("How much do you want to deposit into it? (ex: 53.22): ");
        Double money=input.nextDouble();
        while(money<0){
            System.out.println("Enter a valid amount, amount >=0: ");
            money=input.nextDouble();
        }
        return new CheckAccount(money,name);

    }

    static SavingsAccount createSavingsAccount(){
        SavingsAccount temp=new SavingsAccount(null,null);
        System.out.printf("Yearly return rate: %.2f\n",temp.getRate());
        System.out.printf("Annual fees: $%.2f\n",temp.getFees());
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter name : ");
        String name=input.nextLine();
        System.out.println("How much do you want to deposit into it? (ex: 53.22): ");
        Double money=input.nextDouble();
        while(money<0){
            System.out.println("Enter a valid amount, amount >=0: ");
            money=input.nextDouble();
        }
        return new SavingsAccount(money,name);

    }

    static BusinessAccount createBusinessAccount(){
        BusinessAccount temp=new BusinessAccount(null,null,0);
        System.out.printf("Annual fees: $%.2f\n",temp.getFees());
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter Company name : ");
        String name=input.nextLine();
        System.out.println("How much do you want to deposit into it? (ex: 53.22): ");
        Double money=input.nextDouble();
        while(money<0){
            System.out.println("Enter a valid amount, amount >=0: ");
            money=input.nextDouble();
        }
        System.out.println("Enter Tax ID: ");
        int tax=input.nextInt();
        return new BusinessAccount(money,name,tax);

    }

    static boolean deposit(BankAccount account,double money){
        if(money>=0){
            account.deposit(money);
            return true;
        }
        return false;
    }

    static boolean withdraw(BankAccount account,double money){
        if(money>=0 && (account.getBalance()-money>=0)){
            account.withdraw(money);
            return true;
        }
        return false;
    }

}
