package javaudemy.ComportamentoMemoria.Vetores.Exercicios02;

import java.util.Locale;
import java.util.Scanner;
import javaudemy.ComportamentoMemoria.Vetores.Exercicios02.Pessoa;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serao digitadas? ");
        int n = scan.nextInt();

        Pessoa[] pessoa = new Pessoa[n];

        for (int i = 0; i < pessoa.length; i++) {
            System.out.println("Dados da " + (i+1) + "a " + "pessoa:");
            scan.nextLine();
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Idade: ");          
            int idade = scan.nextInt();
            System.out.print("Altura: ");
            double altura = scan.nextDouble();
            pessoa[i] = new Pessoa(nome, idade, altura);
        }

        scan.close();
    }
}
