package javaudemy.ComportamentoMemoria.Vetores.Exercicios03;

import java.util.Scanner;

import Aula8.doubleMenorMaior;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("How many rooms will be rented? ");
        int n = scan.nextInt();

        Rooms[] rooms = new Rooms[n];

        for (int i = 0; i < rooms.length; i++) {
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.println("Email");
            String email = scan.nextLine();
            int room = scan.nextInt();
        }
        
        rooms[] = new Rooms(name, email, room);



        scan.close();
    }
}
