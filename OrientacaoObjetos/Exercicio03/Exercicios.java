package javaudemy.OrientacaoObjetos.Exercicio03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        Students stu = new Students();

        System.out.println("Name of Student: ");
        scan.nextLine();
        System.out.println("Digite 3 notas do student ");
        stu.notas += scan.nextDouble();
        stu.notas += scan.nextDouble();
        stu.notas += scan.nextDouble();

        System.out.println(stu.notas);
        stu.passOrFailed();
    }
}
