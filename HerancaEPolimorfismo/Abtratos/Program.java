package javaudemy.HerancaEPolimorfismo.Abtratos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the numbe os shapes: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char response = scan.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            System.out.println("Width: ");
            double width = scan.nextDouble();
            System.out.println("Height: ");
            double height = scan.nextDouble();
        }
    }
}
