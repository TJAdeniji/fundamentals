import java.util.*;

public class BankAccount {
    
 private double checkingBalance = 0;
 private double savingsBalance = 0;

 private static int numOfAccounts = 0;
 private static double totalMoney = 0;

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    } 

    public BankAccount(){
        numOfAccounts++;
    }

    public BankAccount(checkingBalance, savingsBalance){
     this.checkingBalance = checkingBalance;
     this.savingsBalance = savingsBalance;

     numOfAccounts++;
    }
    
    public void deposit(double depositedAmount, String account){
        if (account == 'checking'){
            this.checkingBalance += depositedAmount; 
            totalMoney += depositedAmount;
        }
        else if(account == 'savings'){ 
            this.savingsBalance += depositedAmount;
            totalMoney += depositedAmount;
        }
    }

    public double withdraw(double withdrawnAmount, String account){
        double newBalance = 0;
        if (account == 'checking'){
            if (withdrawnAmount - this.checkingBalance < 0){
                System.out.println("I'm sorry, you don't have enough funds to make this transaction.\n");
            }
            else{
                newBalance = checkingsBalance - withdrawnAmount;
                totalMoney -= withdrawnAmount;
                return newBalance;
            }
        }
        else if (account == "savings"){
            if (withdrawnAmount - this.savingsBalance < 0){
                System.out.println("I'm sorry, you don't have enough funds to make this transaction.\n");
            }
            else{
                newBalance = savingsBalance - withdrawnAmount;
                totalMoney -= withdrawnAmount;
                return newBalance;
            }
        }
    }    

}