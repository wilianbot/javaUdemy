package javaudemy.ConstrutoresSobrecargaEtc.Exercicio01;

public class Bank {

    // Atribudos propriedades

    private int number;
    private String name; 
    private double saldo;

    // Construtores

    public Bank(int number, String name) { 
        this.number = number;
        this.name = name;
    }

    public Bank(int number, String name, double initialDeposit) { 
        this.number = number;
        this.name = name;
        addSaldo(initialDeposit);
    }

    // Metodos de acesso

    public int getNumber(){
        return number;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
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

    // toString

    public String toString(){
        return "Account " 
        + number 
        + " Holder: " 
        + name 
        + "," 
        + " Balance " 
        + String.format("%.2f", saldo);
    }
}
