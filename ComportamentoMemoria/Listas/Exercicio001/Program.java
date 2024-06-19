package javaudemy.ComportamentoMemoria.Listas.Exercicio001;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javaudemy.ComportamentoMemoria.Listas.Exercicio001.Employee;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("How many emploees will be registered? ");
        int n = scan.nextInt();
        
        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Emploee #" + (i + 1) + ":");
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
        int idsalary = scan.nextInt();
        Integer pos = position(list, idsalary);
        
        if (pos == null) {
            System.out.println("This id does not exist!");
        }
        else {
            System.out.println("Enter the percentage: ");
            double percent = scan.nextDouble();
            list.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees");
        for (Employee emp : list) {
            System.out.println(emp);
        }


        scan.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }
}
