package oybek.Chapter2;

import java.util.Scanner;

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        //create a Scanner object
        Scanner input = new Scanner(System.in);

        //prompt the user to enter a radius
        System.out.println("Enter a number for radius");
        double radius = input.nextDouble();

        //compute area
        double area = radius * radius * 3.14159;

        //display results
        System.out.println("The area for the cicrle of radius " +
                radius + " is " + area);
    }
}
