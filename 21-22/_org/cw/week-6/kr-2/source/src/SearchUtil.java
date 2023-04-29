public class SearchUtil {

    public static int linearSearch(int[] array, int key) {

        for (int index = 0; index < array.length; index++) {
            if (array[index] == key) {
                return index;
            }
        }

        return -1; // if the value is not found, return -1
    }

    public static int binarySearch(int[] array, int elementToFind) {
        int left = 0; // left part of the array: index 0
        int right = array.length - 1; // right part of the array: latest index
        int middle = (left + right) / 2; // middle element of the array

        while (left <= right) {
            if (elementToFind == array[middle]) { // if the element is found in the middle, return it
                return middle;
            } else if (elementToFind < array[middle]) { // if the element is lower than the middle of the array
                right = middle - 1; // eliminate the right part of the array (the values are greater than the elementToFind)
            } else { // if elementToFind is lower than the middle element
                left = middle + 1; // eliminate the left part of the array (the values are lower than the elementToFind)
            }

            middle = (left + right) / 2; // re-calculate the middle of the array
        }

        return -1; // if the value is not found, return -1
    }
}
