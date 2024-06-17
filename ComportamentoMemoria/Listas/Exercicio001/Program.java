package javaudemy.ComportamentoMemoria.Listas.Exercicio001;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many emploees will be registered? ");
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Emploee #" + (i + 1));
            System.out.print("Id: ");
            Integer id = scan.nextInt();
            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();
            System.out.print("Salary: ");
            Double salary = scan.nextDouble();

            Employee emp = new Employee(id, name, salary);

            list.add(emp);
        }

        System.out.print("Enter the employee id that bill have salary increase: "); 

        System.out.println("List of employees");


        scan.close();
    }
}
