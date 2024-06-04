package oybek.gita;

import java.util.Scanner;

public class NextDateCalculator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //reading the date
        System.out.println("Enter day: ");
        int day = scanner.nextInt();
        System.out.println("Enter month: ");
        int month = scanner.nextInt();

        //calculating the next date
        String result = getNextDate(day, month);
        System.out.println(result);

        scanner.close();
    }
    public static String getNextDate(int day, int month){
        // Number of days in each month (non-leap year)
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        if (month < 1 || month > 12){
            return "There is no such month";
        }
        if (day < 1 || day > daysInMonth[month -1]){
            return "No such date";
        }

        //increment the day
        day ++;

        //check if the day exceeds the number of days in the month
        if (day > daysInMonth[month -1 ]){
            day = 1;
            month++;
            //check if the month exceeds December
            if (month > 12){
                month = 1;
            }
        }
        //format the day and month to have two digits
        String dayStr = String.format("%02d",day);
        String monthStr = String.format("%02d",month);

        return dayStr + "." + monthStr;
    }

}
