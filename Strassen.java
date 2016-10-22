package Strassen;

import java.util.Scanner;

/**
 *
 * @author ksramirez
 */
public class Strassen {

    public static void main(String[] args) {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        Scanner scan = new Scanner(System.in);
        System.out.println("Input 4 number in Matrix A: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("a[" + i + "]" + "[" + j + "]" + " = ");
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("");
        System.out.println("Input 4 number in Matrix B: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("b[" + i + "]" + "[" + j + "]" + " = ");
                b[i][j] = scan.nextInt();
            }
        }
        System.out.println("");
        int m1 = (a[0][0] + a[1][1]) * (b[0][0] + b[1][1]);
        int m2 = (a[1][0] + a[1][1]) * b[0][0];
        int m3 = a[0][0] * (b[0][1] - b[1][1]);
        int m4 = a[1][1] * (b[1][0] - b[0][0]);
        int m5 = (a[0][0] + a[0][1]) * b[1][1];
        int m6 = (a[1][0] - a[0][0]) * (b[0][0] + b[0][1]);
        int m7 = (a[0][1] - a[1][1]) * (b[1][0] + b[1][1]);
        c[0][0] = m1 + m4 - m5 + m7;
        c[0][1] = m3 + m5;
        c[1][0] = m2 + m4;
        c[1][1] = m1 + m3 - m2 + m6;
        System.out.println("Matrix C(A*B): ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("c[" + i + "]" + "[" + j + "]" + " = " + c[i][j]);
            }
        }
    }

}
