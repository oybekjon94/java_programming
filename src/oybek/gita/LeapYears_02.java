package oybek.gita;

import java.util.Scanner;

public class LeapYears_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        System.out.println(year + " is a leap year? " + getDaysInYear(year));

        scanner.close();
    }
    //methods to determine the number of days in a given year
    public static int getDaysInYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return 366; //leap year
        }else {
            return 365; //non-leap year
        }
    }
}
