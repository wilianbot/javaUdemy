package javaudemy.ComportamentoMemoria.Vetores.Exercicios01;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int n;
        System.out.print("Quantos numeros voce vai digitar? ");
        n = scan.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < vector.length; i++) {  
                System.out.print("Digite um numero: ");
                int number = scan.nextInt();
                
                if(number <= 10){
                    vector[i] = number;
                }
                else{
                    System.out.println("Digite um numero valido!");
                }
        }

        System.out.println("NUMERO NEGATIVOS");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 0) {
                System.out.println(vector[i]);
            }
        }

        scan.close();
    }
}
