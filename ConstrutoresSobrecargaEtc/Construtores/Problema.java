package javaudemy.ConstrutoresSobrecargaEtc.Construtores;

import java.util.Locale;
import java.util.Scanner;

import javaudemy.ConstrutoresSobrecargaEtc.Construtores.Product;

public class Problema {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter product data:");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Price: ");
        double price = scan.nextDouble();
        Product product = new Product(name, price);
        Product product2 = new Product();

        System.out.print("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scan.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = scan.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: 0" + product);

        scan.close();
    }
}
