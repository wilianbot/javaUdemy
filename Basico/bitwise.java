package javaudemy.Basico;

import java.util.Scanner;

public class bitwise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mask = 0b100000;
        int n = scan.nextInt();

        if((n & mask) != 0) {
            System.out.println("6th bit is true!");
        } else {
            System.out.println("6th bit is false!");
        }

        scan.close();
    }
}
