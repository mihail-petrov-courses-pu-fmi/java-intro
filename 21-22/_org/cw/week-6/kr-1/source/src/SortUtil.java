import java.util.Arrays;

public class SortUtil {

    public static void bubbleSort(int[] array) {
        int element;
        int length = array.length;

        for (int i = 1; i < length; i++) {

            for (int j = length-1; j >= i; j--) {
                if (array[j-1] > array[j]) {
                    element = array[j-1];
                    array[j-1] = array[j];
                    array[j] = element;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
