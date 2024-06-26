package javaudemy.HerancaEPolimorfismo.Exemplo;

public final class SavingAccout extends Account {
    private Double interestRate;

    public SavingAccout() {
        super();
    }

    public SavingAccout(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
    

}
