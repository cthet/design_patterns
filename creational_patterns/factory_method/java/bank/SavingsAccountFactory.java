public class SavingsAccountFactory extends AccountFactory {

  @Override
  public BankAccount createAccount(String type) {
      if (validateAccountData(type)) {
        logAccountCreation(type);
        return new SavingsAccount(); 
      } else {
        System.out.println("Données de compte invalides");
        return null;
    }
  }
}