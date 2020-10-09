package Eslam.learnprogramming;

import java.util.Scanner;

public class Problem4 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*** Asterisk Pyramids Problem ***/

        System.out.println("Enter size of your pyramid:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j += 2) {
                System.out.print("*");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
