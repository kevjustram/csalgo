package practice;

import java.util.Scanner;

/**
 *
 * @author ksramirez
 */
public class Factorials {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number to add from 1 to: ");
        int n = scan.nextInt();
        System.out.println("Sum is: "+addition(n));
    }
    
    public static int addition(int n){
        if (n==1){
            return 1;
        }
        else{
            return n+addition(n-1);
        }
    }
}
