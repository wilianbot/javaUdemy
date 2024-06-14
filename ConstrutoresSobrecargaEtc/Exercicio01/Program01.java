package javaudemy.ConstrutoresSobrecargaEtc.Exercicio01;

import java.util.Locale;
import java.util.Scanner;

import javaudemy.ConstrutoresSobrecargaEtc.Exercicio01.Bank;

public class Program01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Bank account;
        
        System.out.print("Enter account number: ");
        int number = scan.nextInt();
        System.out.print("Enter account golder: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("Is there an initial deposit (y/n)? ");
        char response = scan.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial depoit value: ");
            double initialDeposit = scan.nextDouble();
            account = new Bank(number, name, initialDeposit);
        }
        else {
            account = new Bank(number, name);
        }

        System.out.println("Account data");
        System.out.println(account);
        
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double saldo = scan.nextDouble();
        account.addSaldo(saldo);

        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        saldo = scan.nextDouble();
        account.remoSaldo(saldo);

        System.out.println("Updated account data: " + account);

        scan.close();
    }
}
