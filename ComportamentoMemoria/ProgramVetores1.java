package javaudemy.ComportamentoMemoria;

import java.util.Locale;
import java.util.Scanner;

public class ProgramVetores1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade:");
        int n = scan.nextInt();
        double[] vetor = new double[n];

        System.out.println("Notas:");
        for (int i = 0; i < n; i++) {
            vetor[i] = scan.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vetor[i];
        }
        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT:  %.2f%" + avg);


        scan.close();
    }
}
