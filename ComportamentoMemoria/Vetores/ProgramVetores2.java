package javaudemy.ComportamentoMemoria.Vetores;

import java.util.Locale;
import java.util.Scanner;
import javaudemy.ComportamentoMemoria.Vetores.Product;

public class ProgramVetores2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantidade");
        int n = scan.nextInt();
        Product[] vector = new Product[n];

        for (int i = 0; i < vector.length; i++) {
            scan.nextLine();
            String name = scan.nextLine();
            double price = scan.nextDouble();
            vector[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i = 0; i < vector.length; i++) {
            sum += vector[i].getPrice();
        }

        double avg = sum / vector.length;

        System.out.printf("Average price = %.2f%n", avg);


        scan.close();
    }
}
