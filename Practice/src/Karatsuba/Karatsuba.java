package Karatsuba;

import java.util.Scanner;

/**
 *
 * @author ksramirez
 */
public class Karatsuba {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a four digit number for X:");
        String x = scan.nextLine();
        System.out.print("Enter a four digit number for Y:");
        String y = scan.nextLine();
        int a = Integer.parseInt(x.substring(0, 2));
        int b = Integer.parseInt(x.substring(2, 4));
        int c = Integer.parseInt(y.substring(0, 2));
        int d = Integer.parseInt(y.substring(2, 4));
        int ac = a * c;
        int ad = a * d;
        int bc = b * c;
        int bd = b * d;
        System.out.println("X * Y = "+(ac * 10000) + " + " + ((ad + bc) * 100) + " + " + bd);
        int xy = (ac * 10000) + ((ad + bc) * 100) + bd;
        System.out.println("X * Y = " + xy);
    }
}
