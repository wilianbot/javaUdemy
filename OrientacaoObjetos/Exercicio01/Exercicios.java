package javaudemy.OrientacaoObjetos.Exercicio01;

import java.util.Locale;
import java.util.Scanner;
import javaudemy.OrientacaoObjetos.Exercicio01.Rectangle;


public class Exercicios {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        rectangle.width = scan.nextDouble();
        rectangle.height = scan.nextDouble();

        System.out.println(rectangle);


        scan.close();
    }
}
