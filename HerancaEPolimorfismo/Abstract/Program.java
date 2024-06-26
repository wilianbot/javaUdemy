package javaudemy.HerancaEPolimorfismo.Abstract;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javaudemy.HerancaEPolimorfismo.Exemplo.Account;
import javaudemy.HerancaEPolimorfismo.Exemplo.BusinessAcount;
import javaudemy.HerancaEPolimorfismo.Exemplo.SavingAccout;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

       List<Account> list = new ArrayList<>();

       list.add(new SavingAccout(1001, "Alex", 1000.00, 0.01));
       list.add(new BusinessAcount(1002, "Maria", 1000.00, 400.0));
       list.add(new SavingAccout(1003, "Bob", 300.00, 0.01));
       list.add(new BusinessAcount(1004, "Anna", 500.00, 500.0));

       double sum = 0.0;
       for (Account acc : list) {
            sum += acc.getBalance();
       }

       System.out.printf("Total balance: %.2f%n", sum);

       for (Account acc : list) {
            acc.deposit(10.0);
       }
       for (Account acc : list) {
            System.out.printf("Updated balance for accout %d: %.2f%n", acc.getNumber(), acc.getBalance());
       }
    }
}
