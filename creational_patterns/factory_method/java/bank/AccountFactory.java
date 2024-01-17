public abstract class AccountFactory {
  public abstract BankAccount createAccount(String type);
  
  protected boolean validateAccountData(String type) {
      return type != null && !type.isEmpty();
  }

  protected void logAccountCreation(String type) {
      System.out.println("Création d'un compte de type: " + type);
  }

}