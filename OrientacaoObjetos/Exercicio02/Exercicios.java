package javaudemy.OrientacaoObjetos.Exercicio02;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Employee empl = new Employee();
        
        System.out.print("Name: ");
        empl.name = scan.nextLine();
        System.out.print("Gross salary: ");
        empl.grossSalary = scan.nextDouble();
        System.out.print("Tax: ");
        empl.tax = scan.nextDouble();

        System.out.println("Employee " + empl.name + ", $ " + empl.netSalary());

        System.out.print("Which percentage to increase salary? ");
        double percentage = scan.nextDouble();
        empl.increaseSalary(percentage);

        System.out.println("Update data: " + empl);

        scan.close();
    }
}
