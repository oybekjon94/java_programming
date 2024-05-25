package oybek.Chapter3;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        //generate a lottery number
        int lottery = (int) (Math.random() * 100);

        //prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();

        //get digits from lottery
        int lotteryDigits1 = lottery / 10;
        int lotteryDigits2 = lottery % 10;

        //get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is "+ lottery);

        //check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit1 == lotteryDigits1 && guessDigit1 == guessDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigits1 || guessDigit1 == lotteryDigits2
        || guessDigit2 == lotteryDigits1 || guessDigit2 == lotteryDigits2)
            System.out.println("Match one digit:you win $1000");
        else
            System.out.println("Sorry, no match");
    }
}
