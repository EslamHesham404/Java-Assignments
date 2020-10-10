package Eslam.learnprogramming;

import java.util.Scanner;


public class Problem4b {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter size: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int counter = -1;
        int count = 1;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            // counter = 0;
            for (int j = 0; j <= (i + counter); j++) {

                // for printing the content value of each column
                System.out.print(count % 10);

                // we shall do this else we will go into an infinite loop..
                if (counter == (n - 1)) {
                    break;
                }
                count++;
            }
            counter++;
            System.out.println();
        }
    }
}
