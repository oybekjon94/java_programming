package oybek.Chapter3;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter values for a, b, and c
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Calculate the discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;

        // Determine the number of roots and compute them if they exist
        if (discriminant > 0) {
            // Two real roots
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        } else if (discriminant == 0) {
            // One real root
            double r1 = -b / (2 * a);
            System.out.println("The equation has one root " + r1);
        } else {
            // No real roots
            System.out.println("The equation has no real roots");
        }

        input.close();
    }
}
