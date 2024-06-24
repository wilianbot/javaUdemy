package javaudemy.enumeracaoEcomposicao.Composição;

import java.util.Locale;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter department's name: ");
        String departmentName = scan.nextLine();
        System.out.println("Enter worker data:");
        System.out.println("Name: ");
        String workerName = scan.nextLine();
        System.out.println("Level: ");
        String workerLevel = scan.nextLine();
        System.out.println("Base salary: ");
        double baseSalary = scan.nextDouble();

        // Instanciou um novo objeto do tipo Worker, os dados são os nome, workerlevel e baseSalary que digitei 
        // E associado a esse objeto tem outro objeto chamado department e o nome desse departamento é o nome que digitei
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departmentName));

        System.out.println("How many contracts to this worker? ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("Enter contract #" + i + " data:" );
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(scan.next());
            System.out.print("Value per hour: ");
            double valuePerHour = scan.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = scan.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to caculate income (MM/YYYY): ");
        String monthAndYear = scan.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));


        scan.close();
    }
}
