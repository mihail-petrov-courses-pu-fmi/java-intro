import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Utility.getMenu();

        Scanner scanner = new Scanner(System.in);
        int menuChoice = scanner.nextInt();

        doAction(scanner, menuChoice);
    }

    public static void doAction(Scanner scanner, int menuChoice) {
        switch (menuChoice) {
            case 1:
                ArrayUtility.createArray();
                break;
            case 2:
                ArrayUtility.readArray(scanner);
                break;
            case 3:
                ArrayUtility.readString(scanner);
                break;
            case 4:
                Utility.exit();
                break;
            default:
                System.out.println("Unsupported operation!");
        }
    }
}
