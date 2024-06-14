package javaudemy.OrientacaoObjetos.Exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        CurrencyConverter conv = new CurrencyConverter();

        System.out.println("What is the dollar price? ");
        conv.dollarPrice = scan.nextDouble();
        System.out.println("How many dollars will be bought? ");
        conv.dollarBought = scan.nextDouble();
        System.out.println(conv);

    }
}
