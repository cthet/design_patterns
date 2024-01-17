public class CheckingAccount extends BankAccount {
  private BigDecimal overdraftLimit = new BigDecimal(1000);

  @Override
  public void withdraw(BigDecimal amount) {
      if (amount.compareTo(balance.add(overdraftLimit)<=0) {
        this.balance = balance.substract(amount);
        System.out.println("Retrait de " + amount + " euros. Nouveau solde: " + balance);
      } else {
          System.out.println("Limite de découvert dépassée pour le retrait");
      }
  }
}