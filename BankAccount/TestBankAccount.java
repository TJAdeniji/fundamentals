import java.util.*;

public class TestBankAccount{

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();

        System.out.println("Here's your balance: " + account1.getCheckingBalance() + "\n");
        account1.deposit(150.00, "checking");
        account1.deposit(250.00, "savings");
        System.out.println("Deposit made.");
        account1.accountBalance();

        account1.withdraw(20.0, "checking");
        account1.withdraw(100.00, "savings");
        System.out.println("Withdrawl made.");
        account1.accountBalance();

        
        System.out.println(BankAccount.totalMoney);
        System.out.println(BankAccount.numOfAccounts);

        
    }
}