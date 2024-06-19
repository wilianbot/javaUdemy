package javaudemy.ComportamentoMemoria.Matrizes;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[][] mat = new int[n][n];
        
        for (int i = 0; i < mat.length; i++){ // mat.length percorrer as linhas
            for (int j = 0; mat[i].length < n; j++) { // mat[i].length as colunas
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.println();
        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.println(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < mat.length; i++) { // mat.length percorer as linhas
            for (int j = 0; mat[i].length < n; j++) { // mat[i].length as colunas
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }
        System.out.println("Negative Numbers = " + count);

    }
}
