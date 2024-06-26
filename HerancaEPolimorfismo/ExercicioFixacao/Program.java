package javaudemy.HerancaEPolimorfismo.ExercicioFixacao;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i+1) + " data:");            
            System.out.print("Common, used ou imported (c/u/i)? ");
            char response = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Price: ");
            double price = scan.nextDouble();
            if (response == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY)");
                LocalDate manufactureDate = LocalDate.parse(scan.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, manufactureDate));
            } else if(response == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = scan.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
            else {
                list.add(new Product(name, price));
            }
        }
        System.out.println("PRICE TAGS:");
        for (Product pro : list) {
            System.out.println(pro.priceTag());
        }
        scan.close();
    }
}
