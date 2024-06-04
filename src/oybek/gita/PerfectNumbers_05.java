package oybek.gita;

import java.util.Scanner;

public class PerfectNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //reading the upper limit N
        System.out.println("Enter a natural number N: ");
        int N = scanner.nextInt();

        //Generating perfect numbers up to N
        generatePerfectNumbers(N);

        scanner.close();
    }

    public static void generatePerfectNumbers(int N){
        for (int i = 1; i <= N; i++){
            if (isPerfect(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPerfect(int number){
        int sum = 0;

        //finding all proper divisors and summing them up
        for (int i = 1; i <= number / 2; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        //a number is perfect if the sum of its proper divisors is equal to itself
        return sum == number;
    }
}
