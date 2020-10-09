package Eslam.learnprogramming;

import java.util.Scanner;

public class Problem1 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        /*** Triangle Problem ***/

        System.out.println("Enter the first side");
        int x = scanner.nextInt();

        System.out.println("Enter the second side");
        int y = scanner.nextInt();

        System.out.println("Enter the third side");
        int z = scanner.nextInt();

        x = (int) Math.pow(x, 2);
        y = (int) Math.pow(y, 2);
        z = (int) Math.pow(z, 2);

        System.out.println("************************************************");

        // Checking for all sides.

        if ((x == (y + z)) || (y == (x + z)) || (z == (x + y))) {
            System.out.println("The triangle is Right angled");
        } else if ((x > (y + z)) || (y > (x + z)) || (z > (x + y))) {
            System.out.println("The triangle is Obtuse angled");
        } else {
            System.out.println("The triangle is Acute angled");
        }
    }
}