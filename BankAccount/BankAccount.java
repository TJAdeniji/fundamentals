import java.util.*;

public class BankAccount {
    
 private double checkingBalance = 0;
 private double savingsBalance = 0;

 public static int numOfAccounts = 0;
 public static double totalMoney = 0;

    public BankAccount(){
        numOfAccounts++;
    }

    public BankAccount(double checkingBalance, double savingsBalance){
     this.checkingBalance = checkingBalance;
     this.savingsBalance = savingsBalance;

     numOfAccounts++;
    }

    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    } 
    
    public void deposit(double depositedAmount, String account){
        if (account.equals("checking")){
            this.checkingBalance += depositedAmount; 
        }
        else if(account.equals("savings")){ 
            this.savingsBalance += depositedAmount;
        }
        BankAccount.totalMoney += depositedAmount;
    }

    public void withdraw(double withdrawnAmount, String account){
        if (account.equals("checking")){
            if (this.checkingBalance - withdrawnAmount < 0){
                System.out.println("I'm sorry, you don't have enough funds to make this transaction.\n");
            }
            else{
                this.checkingBalance -= withdrawnAmount;
                totalMoney -= withdrawnAmount;
            }
        }
        else if (account.equals("savings")){
            if (this.savingsBalance - withdrawnAmount < 0){
                System.out.println("I'm sorry, you don't have enough funds to make this transaction.\n");
            }
            else{
                this.savingsBalance -= withdrawnAmount;
                totalMoney -= withdrawnAmount;
            }
        }
    } 
    
    public void accountBalance(){
        System.out.println("Checking: " + this.checkingBalance + " Savings: " + this.savingsBalance);
    }


}