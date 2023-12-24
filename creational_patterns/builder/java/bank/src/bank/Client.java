package bank;

public class Client {
    public static void main(String[] args) {
        BankAccount savingsAccount = new BankAccount.Builder(12345678)
                .withOwner("John Doe")
                .withBalance(1000.00)
                .withInterestRate(0.02)
                .withAccountType("Savings")
                .build();


        BankAccount checkingAccount = new BankAccount.Builder(87654321)
                .withOwner("Emma Stone")
                .withDebitCard()
                .withAccountType("Checking")
                .build();

        System.out.println(savingsAccount);
        System.out.println(checkingAccount);

        //BankAccount{accountNumber=12345678, owner='John Doe', balance=1000.0, interestRate=0.02, hasDebitCard=false, accountType='Savings'}
        //BankAccount{accountNumber=87654321, owner='Emma Stone', balance=0.0, interestRate=0.01, hasDebitCard=true, accountType='Checking'}
    }
}
