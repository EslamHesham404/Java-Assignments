package Eslam.learnprogramming;

import java.util.Scanner;

public class Problem2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        /*** testing ***/
//        int x = 12;
//        int z = x;
//        x += 12;
//        x *= 10;
//
//        System.out.println("z = " + z);
//        System.out.println("x = " + x);

        /*** Salary Problem ***/

        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter your annual rate");
        double annualRate = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter your target");
        double target = scanner.nextDouble();

        scanner.nextLine();

        final int MONTHLY_PAID = 1;
        int months = 0;
        int years = 0;
        int remainingMonths = 0;
        double totalSalary = 0;
        double updatedSalary = 0;

        while (totalSalary < target) {
            if ((months % 12) == 0) {
                System.out.println("Months = " + months);
                // to keep the salary value.
                updatedSalary = salary * annualRate;
                // then adding the updated percent to the old salary saving it in the orginal salary variable
                salary += updatedSalary;
                years++;
            }
            // to keep track of the overall salaries in all months.
            totalSalary += (salary * MONTHLY_PAID);
            months++;
            remainingMonths = months % 12;
        }
        System.out.println("You will reach " + target + " in " + years + " years and " +
                remainingMonths + " months.");
    }
}
