public class Main {
  public static void main(String[] args) {
      AccountFactory savingsFactory = new SavingsAccountFactory();
      AccountFactory checkingFactory = new CheckingAccountFactory();

      BankAccount savingsAccount = savingsFactory.createAccount("Savings");
      if (savingsAccount != null) {
          savingsAccount.deposit(1000);
          savingsAccount.withdraw(200);
      }

      BankAccount checkingAccount = checkingFactory.createAccount("Checking");
      if (checkingAccount != null) {
          checkingAccount.deposit(500);
          checkingAccount.withdraw(100);
      }

  }
}