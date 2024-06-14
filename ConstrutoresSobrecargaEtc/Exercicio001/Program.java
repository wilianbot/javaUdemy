package javaudemy.ConstrutoresSobrecargaEtc.Exercicio001;

import java.util.Locale;
import java.util.Scanner;

import javaudemy.ConstrutoresSobrecargaEtc.Exercicio001.Account;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int number = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter account holder: ");
        String holder = scan.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char response = scan.next().charAt(0);
        if(response == 'y'){
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = scan.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }
        else {
            account = new Account(number, holder);
        }
        System.out.println("Account data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double saldo = scan.nextDouble();
        account.addSaldo(saldo);

        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        saldo = scan.nextDouble();
        account.remoSaldo(saldo);

        System.out.println("updated account data: ");
        System.out.println(account);


        scan.close();
    }
}
