import java.time.Year;
import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // Constants
        final int VALID_MONTH_NUMBER_START  = 1;
        final int VALID_MONTH_NUMBER_END    = 12;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Please, enter month number: ");
        int monthNumber = scanner.nextInt();
        
        // TODO: Replace with random generated month number
        // int monthNumber = random.nextInt(12 - 1) + 1;

        boolean isValidMonthNumber = monthNumber >= VALID_MONTH_NUMBER_START &&
                                     monthNumber <= VALID_MONTH_NUMBER_END;

        if (isValidMonthNumber) {

            String monthName;

            // Find month name by month number
            switch (monthNumber) {
                case 1:
                    monthName = "January";
                    break;
                case 2:
                    monthName = "February";
                    break;
                case 3:
                    monthName = "March";
                    break;
                case 4:
                    monthName = "April";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "June";
                    break;
                case 7:
                    monthName = "July";
                    break;
                case 8:
                    monthName = "August";
                    break;
                case 9:
                    monthName = "September";
                    break;
                case 10:
                    monthName = "October";
                    break;
                case 11:
                    monthName = "November";
                    break;
                case 12:
                    monthName = "December";
                    break;
                default:
                    monthName = "Month Name Not Found!";
            }

            // Evaluate the days in the specified month
            int monthDays;

            if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12 ) {
                monthDays = 31;
            } else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
                monthDays = 30;
            } else if (monthNumber == 2) {
                // Calculating leap year
                System.out.println("Please enter a specific year: ");
                int year = scanner.nextInt();

                boolean isLeapYear;

                if (year % 4 != 0) {
                    isLeapYear = false;
                } else if (year % 400 == 0) {
                    isLeapYear = true;
                } else if (year % 100 == 0) {
                    isLeapYear = false;
                } else {
                    isLeapYear = true;
                }

                System.out.println("[Own calculations] " + year + " is leap: " + isLeapYear);
                System.out.println("[Library calculations] " + year + " is leap: " + Year.of(year).isLeap());

                monthDays = isLeapYear ? 29 : 28;
            } else {
                // Not valid month number
                monthDays = 0;
            }

            System.out.println("The name of the entered month number: " + monthNumber + " is: " + monthName +
                                " and it contains " + monthDays + " days!");
        } else {
            System.out.println("Invalid month! Please enter a valid month number between " +
                                VALID_MONTH_NUMBER_START + " and " + VALID_MONTH_NUMBER_END);
        }
    }
}
