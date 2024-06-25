package javaudemy.enumeracaoEcomposicao.Exercicio;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Program {
    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = scan.nextLine();
        System.out.print("Email: ");
        String email = scan.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(scan.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scan.next());

        Order order = new Order(new Date(), status, client);

        System.out.println("How many items to this order? ");
        int N = scan.nextInt();
        for (int i = 0; i <= N; i++) {
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            scan.nextLine();
            String productName = scan.nextLine();
            System.out.print("Product price: ");  
            double productPrice = scan.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scan.nextInt();
            
            Product product = new Product(productName, productPrice);

            OrderItem it = new OrderItem(quantity, productPrice, product);

            order.addItem(it);
        }

        System.out.println();
        System.out.println(order);


        scan.close();
    }
}
