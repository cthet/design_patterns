public abstract class BankAccount {
  protected BigDecimal balance;

  public void deposit(BigDecimal amount) {
      this.balance = this.balance.add(amount);
      System.out.println("Dépôt de " + amount + " euros. Nouveau solde: " + this.balance);
  }

  public abstract void withdraw(BigDecimal amount);
}