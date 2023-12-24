package bank;

public class Builder {
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


}
