package javaudemy.OrientacaoObjetos.Exercicio04;

public class CurrencyConverter {
    public double dollarPrice;
    public double dollarBought;
    public double reais;

    public double dollarBought(){
        reais = (dollarBought * dollarPrice) + tax();
        
        return reais;
    }

    public double tax(){
        return reais * 6 / 100;
    }

    public String toString(){
        return "Amount to be paid in reais = " 
        + String.format("%.2f", dollarBought());
    }
}
