package Eslam.learnprogramming;

import java.util.Scanner;

public class Problem7 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] ess) {

        /*** Palindrome Problem ***/

        System.out.println("Enter your text");
        String original = scanner.nextLine();

        int length = original.length();
        String reverse = "";

        for (int i = (length - 1); i >= 0; i--) {
            reverse += original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
