package javaudemy.ConstrutoresSobrecargaEtc.Exercicio001;

public class Account {
    private Integer number;
    private String holder;
    private double saldo;


    // Construtores

    public Account(Integer number, String holder){
        this.number = number;
        this.holder = holder;
    }

    public Account(Integer number, String holder, double initialDeposit){
        this.number = number;
        this.holder = holder;
        addSaldo(initialDeposit);
    }

    // Metodos de acesso

    public int getNumber(){
        return number;
    }

    public String getHolder(){
        return holder;
    }

    public void setHolder(String holder){
        this.holder = holder;
    }

    public double getSaldo(){
        return saldo;
    }


    // Metodos

    public void addSaldo(double saldo){
        this.saldo += saldo;
    }

    public void remoSaldo(double saldo){
        this.saldo -= saldo + 5;
    }


    public String toString(){
        return "Account" + number + ", Holder: " + holder + ", Balance: " + saldo;
    }
    

}
