package oybek.gita;

import java.util.Scanner;

public class SmallestOfThree_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three number (first set): ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("Smallest number in the first set: " + findSmallest(num1, num2, num3));

        //input for the second set of numbers
        System.out.println("Enter three numbers (second set): ");
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        System.out.println("Smallest number in the second set: " + findSmallest(num4, num5, num6));

        // Input for the third set of numbers
        System.out.println("Enter three numbers (third set): ");
        int num7 = scanner.nextInt();
        int num8 = scanner.nextInt();
        int num9 = scanner.nextInt();
        System.out.println("Smallest number in the third set: " + findSmallest(num7, num8, num9));

        scanner.close();
    }
    //method to find the smallest if three numbers
    public static int findSmallest(int a, int b, int c){
        int smallest = a;

        if (b < smallest){
            smallest = b;
        }
        if (c < smallest){
            smallest  = c;
        }
        return smallest;
    }
}
