package javaudemy.ComportamentoMemoria.Vetores.Exercicios03;

import java.util.Scanner;
import java.util.Locale;

import javaudemy.ComportamentoMemoria.Vetores.Exercicios03.Rent;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rent[] vect = new Rent[10];

        System.out.print("How many room will be rented? ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Email: ");
            String email = scan.next();
            System.out.print("Room: ");
            int roomNumber = scan.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }   

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ":" + vect[i]);
            }
        }


        scan.close();
    }
}
