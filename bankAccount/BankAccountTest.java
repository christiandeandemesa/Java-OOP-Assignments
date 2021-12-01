public class BankAccountTest {
    public static void main(String[] args) {
        
        // Bank Account
        BankAccount bankAccount1 = new BankAccount();

        // Testing methods
        bankAccount1.getCheckingBalance();
        bankAccount1.getSavingsBalance();

        bankAccount1.withdrawAmount(100.00, "checking");
        bankAccount1.depositAmount(100.00, "checking");
        bankAccount1.withdrawAmount(50.00, "checking");

        bankAccount1.getTotalAmount();
        
    }
}