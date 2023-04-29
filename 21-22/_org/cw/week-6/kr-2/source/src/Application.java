import java.util.Arrays;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        getMenu();

        Scanner scanner = new Scanner(System.in);
        int menuChoice = scanner.nextInt();

        doAction(menuChoice);
    }

    private static void doAction(int menuChoice) {
        switch (menuChoice) {
            case 1:
                int[] array = {23, 45, 21, 55, 234, 1, 34, 90};
                int searchKey = 34;
                int linearSearchResult = SearchUtil.linearSearch(array, searchKey);
                System.out.println("The value: " + searchKey + " was found on index: " + linearSearchResult);
                break;
            case 2:
                int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
                int elementToFind = 1;
                int binarySearchResult = SearchUtil.binarySearch(sortedArray, elementToFind);
                System.out.println("The value: " + elementToFind + " was found on index: " + binarySearchResult);
                break;
            case 3:
                int[] arrayToSort = {3, 6, 45, 4, 32, 1};
                SortUtil.bubbleSort(arrayToSort);
                break;
            case 4:
                int[] arrToSort = {3, 6, 45, 4, 32, 1};
                Arrays.sort(arrToSort);
                System.out.println(Arrays.toString(arrToSort));
                break;
            case 5:
                ArrayMatrix.printMatrix();
                break;
            default:
                System.out.println("Unsupported Operation!");
        }
    }

    private static void getMenu() {
        System.out.println("Please choose an option from the menu:");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Bubble Sort");
        System.out.println("4. Quick Sort");
        System.out.println("5. Array Matrix Demo");
    }
}
