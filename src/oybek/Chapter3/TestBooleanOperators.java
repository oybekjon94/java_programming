package oybek.Chapter3;

import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        //Receive an input
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0)
            System.out.println(number + " is divisible by 2 or 3.");
        if (number % 2 == 0 || number % 3 == 0)
            System.out.println(number + " is divisible by 2 or 3.");
        if (number % 2 == 0 ^ number %  3 == 0)
            System.out.println( number + " is divisible by 2 or 3, but not both");
    }
}
