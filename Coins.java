package Coins;

import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        double money = scan.nextDouble();
        System.out.println("10 peso bills: " + (int) (money / 10));
        money %= 10;
        System.out.println("5 peso coins: " + (int) (money / 5));
        money %= 5;
        System.out.println("1 peso coins: " + (int) (money / 1));
        money %= 1;
        System.out.println("25 cent coins: " + (int) (money / .25));
    }
}
