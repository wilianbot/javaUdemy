package javaudemy.Basico;

import java.util.Scanner;

public class funcoessintaxe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        scan.close();
    }

    public static int max(int a, int b, int c) { // Os parametro não precisam ter o mesmo nome
        int aux;
        if(a > b && a > c){
            aux = a;
        }else if(b > c){
            aux = b;
        }else{
            aux = c;
        }

        return aux;
    }

    public static void showResult(int higher){
        System.out.println("Higher = " + higher);
    }



}
