public class CheckingAccountFactory extends AccountFactory {

  @Override
  public BankAccount createAccount(String type) {
      if (validateAccountData(type)) {
        logAccountCreation(type);
        return new CheckingAccount();
      } else {
        System.out.println("Données de compte invalides");
        return null;
      }
  }
}