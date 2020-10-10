package Eslam.learnprogramming;

import java.util.Scanner;

public class Problem5 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter size: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int counter = -1;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            // counter = 0;
            for (int j = 0; j <= (i + counter); j++) {

                if (j > i - 1) {
                    count--;
                }

                if (j < i) {
                    count++;
                }

                // for printing the content value of each column
                System.out.print(count % 10);

                // we shall do this else we will go into an infinite loop..
                if (counter == (n - 1)) {
                    break;
                }
            }
            counter++;
            System.out.println();
        }
    }
}
