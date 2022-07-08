package oop.t1_WorkingWithAbstraction;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        printRow(n);

    }
    public static void printRow(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <= n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i > 0; i--) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
