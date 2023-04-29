import java.util.Scanner;

public class Console {

    public static Scanner inputScanner = new Scanner(System.in);

    public static void write(String input) {
        System.out.print(input);
    }

    public static void writeln(String input) {
        System.out.print(input);
    }

    public static int readInt() {
        return inputScanner.nextInt();
    }

    public static int readInt(String message) {
        write(message);
        return readInt();
    }

    public static String readString() {
        return inputScanner.next();
    }

    public static String readString(String message) {
        write(message);
        return readString();
    }

    public static double readDouble() {
        return inputScanner.nextDouble();
    }

    public static double readDouble(String message) {
        write(message);
        return readDouble();
    }
}
