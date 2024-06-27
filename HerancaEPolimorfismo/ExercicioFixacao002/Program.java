package javaudemy.HerancaEPolimorfismo.ExercicioFixacao002;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Tax> list = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers: ");
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Individual or company (i/c)? ");
            char response = scan.next().charAt(0);
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = scan.nextDouble();
            if (response == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = scan.nextDouble(); 
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberEmployees = scan.nextInt();
                list.add(new Company(name, anualIncome, numberEmployees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for (Tax tax : list) {
            System.out.println(tax.getName() + ": $ " + String.format("%.2f", tax.imposto()));
        }

        System.out.println();
        double sum = 0.0;
        for (Tax tax : list) {
            sum += tax.imposto();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        scan.close();
    }
}
