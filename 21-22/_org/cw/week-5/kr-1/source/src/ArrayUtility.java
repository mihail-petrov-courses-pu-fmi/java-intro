import java.util.Scanner;

public class ArrayUtility {

    public static void createArray() {
        int [] numbersArray; // array declaration
        numbersArray = new int[5]; // initialization of the array and save memory for 5 elements

        // initialization of the array elements
        numbersArray[0] = 10;
        numbersArray[1] = 20;
        numbersArray[2] = 30;
        numbersArray[3] = 40;
        numbersArray[4] = 50;
        // numbersArray[5] = 60; // Error, array index out of bounds

        // shorter equivalent of array declaration and initialization
        // int[] numbersArray = {10, 20, 30, 40, 50};

        // Print into the console
        System.out.println("Element at index 0: " + numbersArray[0]);
        System.out.println("Element at index 1: " + numbersArray[1]);
        System.out.println("Element at index 2: " + numbersArray[2]);
        System.out.println("Element at index 3: " + numbersArray[3]);
        System.out.println("Element at index 4: " + numbersArray[4]);
        // System.out.println("Element at index 4: " + array[5]);
    }

    public static void readArray(Scanner scanner) {
        System.out.println("Please enter the length of the array:");
        int arrayLength = scanner.nextInt();

        int[] numbersArray = new int[arrayLength];

        for (int index = 0; index < numbersArray.length; index++) {
            System.out.println("Enter an element on index [" + index + "]: ");
            numbersArray[index] = scanner.nextInt();
        }

        printArray(numbersArray);
    }

    public static void readString(Scanner scanner) {
        // Fix Scanner issue with reading from the console
        scanner.nextLine();

        System.out.println("Please enter word/s:");
        String input = scanner.nextLine();

        int counterN = 0; // letter occurrences counter

        for (int index = 0; index < input.length(); index++) {
            char value = input.charAt(index);
            boolean isUpperCaseLetter = Character.isUpperCase(value);

            // Print even and odd indexes
            if (Utility.isEvenNumber(index)) {
                System.out.println("Even array index [" + index + "]: " + value + ". Is upper case? " + isUpperCaseLetter);
            } else {
                System.out.println("Odd array index [" + index + "]: " + value + ". Is upper case? " + isUpperCaseLetter);
            }

            if (value == 'n') counterN++;
        }

        System.out.println("Character [n] occurrences: " + counterN);
    }

    private static void printArray(int[] numbers) {
        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Array index [" + index + "]: " + numbers[index]);
        }
    }
}
