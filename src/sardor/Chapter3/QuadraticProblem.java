package sardor.Chapter3;

import java.util.Scanner;


// 3.1 first exercise problem
public class QuadraticProblem {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) -4 * a * c;

        // 1st case
        if( discriminant > 0 ){
            double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("Equation has two roots " + r1 + " and " + r2);
        }
        // 2nd case
        else if (discriminant == 0) {
            double r1 = -b / (2 * a);
            System.out.println("Equation has one root: " + r1);
        }
        // 3rd case
        else {
            System.out.println("Equation has no real roots.");
        }
        input.close();
    }
}



