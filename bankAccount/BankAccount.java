import java.util.*;
public class BankAccount {

    // Member variables
    private double checkingBalance;
    private double savingsBalance;
    private String accountNumber;

    // Static variables
    private static int numOfAccounts;
    private static double totalAmount;

    // Constructor
    public BankAccount() {
        checkingBalance = 0.0;
        savingsBalance = 0.0;
        // Calls the below method
        accountNumber = getAccountNumber();
        numOfAccounts++;
    }

    // Creates a random 10 digit account number
    public String getAccountNumber() {
        String newAccountNumber = "";
        Random rand = new Random();
        for(int i = 0; i < 10; i++) {
            newAccountNumber += rand.nextInt(10) + 1;
        }
        return newAccountNumber;
    }

    // Get checking balance
    public void getCheckingBalance() {
        System.out.printf("Your checking balance: $%.2f\n", this.checkingBalance);
    }

    // Get savings balance
    public void getSavingsBalance() {
        System.out.printf("Your savings balance: $%.2f\n", this.savingsBalance);
    }

    // Deposit amount
    public void depositAmount(double amount, String account) {
        if(account == "checking") {
            checkingBalance += amount;
            totalAmount += amount;
            System.out.printf("You deposited $%.2f into you checking account\n", amount);
            getCheckingBalance();
        }
        else if(account == "savings") {
            savingsBalance += amount;
            totalAmount += amount;
            System.out.printf("You deposited $%.2f into you savings account\n", amount);
            getSavingsBalance();
        }
        else {
            System.out.println("Please include either 'checking' or 'savings'\n");
        }
    }

    // Withdraw amount
    public void withdrawAmount(double amount, String account) {
        if(account == "checking") {
            if(amount > checkingBalance) {
                System.out.println("Insufficient funds");
            }
            else {
                checkingBalance -= amount;
                totalAmount -= amount;
                System.out.printf("You withdrew $%.2f from your checking account\n", amount);
                getCheckingBalance();
            }
        }
        else if(account == "savings") {
            if(amount > savingsBalance) {
                System.out.println("Insufficient funds");
            }
            else {
                savingsBalance -= amount;
                totalAmount -= amount;
                System.out.printf("You withdrew $%.2f from your savings account\n", amount);
                getSavingsBalance();
            }
        }
        else {
            System.out.println("Please include either 'checking' or 'savings'\n");
        }
    }

    // Get amount from both checking and savings accounts
    public void getTotalAmount() {
        getCheckingBalance();
        getSavingsBalance();
    }

}