package javaudemy.Basico;

import java.util.Scanner;

public class enquantoNumeros {
    public static void main(String[] args) {
       int number = 1;
       int somador = 0;
       Scanner scan = new Scanner(System.in);
       
        while (number != 0) {
        System.out.println("Digite um numero: ");
        number = scan.nextInt();
        somador += number;
       } 
       System.out.println("Total: " + somador);
       scan.close();
    }
}
