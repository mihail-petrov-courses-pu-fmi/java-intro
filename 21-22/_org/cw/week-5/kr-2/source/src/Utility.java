public class Utility {

    // Constants
    public static final int EXIT_STATUS_0 = 0;

    public static void getMenu() {
        System.out.println("Please choose an option from the menu below");
        System.out.println("1. Create an array with numbers and print in the console");
        System.out.println("2. Read an array with numbers from the console");
        System.out.println("3. Read word and present it as an array");
        System.out.println("4. Exit");
    }

    public static void exit() {
        System.out.println("See you soon!");
        System.exit(EXIT_STATUS_0);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
}
