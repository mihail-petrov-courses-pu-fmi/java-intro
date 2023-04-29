import java.util.Scanner;

public class Application {

    // Global constants
    public static final int VALID_MENU_CHOICE_START = 1;
    public static final int VALID_MENU_CHOICE_END   = 6;
    public static final int DEVIL_NUMBER            = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice = 0;

        do {
            getMenu();
            menuChoice = scanner.nextInt();
        } while (isInvalidMenuChoice(menuChoice));

        System.out.println("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = scanner.nextInt();

        calculate(menuChoice, firstNumber, secondNumber);
    }

    private static void calculate(int menuChoice, int firstNumber, int secondNumber) {
        switch (menuChoice) {
            case 1:
                int sum = firstNumber + secondNumber;
                System.out.println("The sum of the two numbers is: " + sum);
                break;
            case 2:
                int subtraction = firstNumber - secondNumber;
                System.out.println("The subtraction of the two numbers is: " + subtraction);
                break;
            case 3:
                int multiplication = firstNumber * secondNumber;
                System.out.println("The multiplication of the two numbers is: " + multiplication);
                break;
            case 4:
                int division = firstNumber / secondNumber;
                System.out.println("The division of the two numbers is: " + division);
                break;
            case 5:
                calculateEvenNumbers(firstNumber, secondNumber);
                break;
            case 6:
                // TODO: Add implementation here
                System.out.println("Work in Progress!");
                break;
            default:
                System.out.println("Unsupported operation!");
        }
    }

    private static void calculateEvenNumbers(int firstNumber, int secondNumber) {
        int counter = firstNumber;

        while (counter <= secondNumber) { // while(true) infinite loop

            if (isDevilNumber(counter)) {
                break;
            }

            if (isEvenNumber(counter)) {
                System.out.println("Even number: " + counter);
                counter++;
                continue;
            }

            System.out.println("Not even number: " + counter);
            counter++;
        }
    }

    private static boolean isDevilNumber(int number) {
        return number == DEVIL_NUMBER;
    }

    private static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    private static boolean isInvalidMenuChoice(int menuChoice) {
        return menuChoice < VALID_MENU_CHOICE_START || menuChoice > VALID_MENU_CHOICE_END;
    }

    private static void getMenu() {
        System.out.println("Please choose operation: ");
        System.out.println("1. Sum numbers");
        System.out.println("2. Subtract numbers");
        System.out.println("3. Multiply numbers");
        System.out.println("4. Divide numbers");
        System.out.println("5. Print even numbers from given interval");
        System.out.println("6. Print odd numbers from given interval");
    }
}
