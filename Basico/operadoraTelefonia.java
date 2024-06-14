package javaudemy.Basico;

import java.util.Scanner;

public class operadoraTelefonia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double minutosConsumidos = 0;
        double minutosConsumidosExtra = 0;
        double valorExtra = 0;

        System.out.println("Quantidades de minutos consumidos: ");
        minutosConsumidos = scan.nextDouble();

        if (minutosConsumidos > 100) {
            minutosConsumidosExtra = minutosConsumidos - 100;
            valorExtra = (minutosConsumidosExtra * 2.0) + 50;
            System.out.printf("Valor a pagar: R$ %.2f%n", valorExtra);
        } else {
            System.out.println("Valor a pagar: R$ 50.00");
        }
        scan.close();
    }
}
