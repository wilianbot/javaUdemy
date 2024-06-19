package javaudemy.ComportamentoMemoria.Matrizes.Exercicio001;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite numero de linhas: ");
        int m = scan.nextInt();
        System.out.println("Digite numero de colunas: ");
        int n = scan.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.println("Digite numero na linha " + i + " coluna " + j);
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.print("Digite um numero da Matriz: ");
        int number = scan.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == number) {
                    System.out.println("Position " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j-1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i-1][j]);
                    }
                    if (j < mat[i].length-1) {
                        System.out.println("Right: " + mat[i][j+1]);
                    }
                    if (i < mat.length-1) {
                        System.out.println("Down: " + mat[i+1][j]);
                    }
                    System.out.println("---------------------");
                }
            }
        }

        scan.close();
    }
}
