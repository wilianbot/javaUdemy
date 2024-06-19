package javaudemy.ComportamentoMemoria.Listas.Exercicio001Novamente;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("How many employees will be registered? ");
        int n = scan.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
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

        System.out.println("Enter the employee id that will have salary increase: ");
        int idSalary = scan.nextInt();
        Integer pos = position(list, idSalary);

        if (pos == null) {
            System.out.println("This id does not exist!");
        }
        else{
            System.out.print("Enter the percentage: ");
            Double percentage = scan.nextDouble();
            list.get(pos).salaryIncrease(percentage);
        }

        System.out.println();
        System.out.println("List of employees");
        for (Employee employee : list) {
            System.out.println(employee);
        }

        scan.close();
    }

    public static Integer position(List<Employee> list, int id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
