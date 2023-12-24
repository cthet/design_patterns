package bank;

public class BankAccount {
    private long accountNumber;
    private String owner;
    private double balance;
    private double interestRate;
    private boolean hasDebitCard;
    private String accountType;

    private BankAccount() {
        // Private to prevent direct instantiation
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", hasDebitCard=" + hasDebitCard +
                ", accountType='" + accountType + '\'' +
                '}';
    }

    public static class Builder {
        private long accountNumber;
        private String owner;
        private double balance = 0.0;
        private double interestRate = 0.01;
        private boolean hasDebitCard = false;
        private String accountType;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder withBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder withInterestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder withDebitCard() {
            this.hasDebitCard = true;
            return this;
        }

        public Builder withAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        public BankAccount build() {
            BankAccount account = new BankAccount();
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            account.hasDebitCard = this.hasDebitCard;
            account.accountType = this.accountType;
            return account;
        }
    }

}
