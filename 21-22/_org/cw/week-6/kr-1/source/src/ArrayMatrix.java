import java.util.Arrays;

public class ArrayMatrix {

    public static void printMatrix() {
        // int[][] matrix = new int[2][4];

        // The matrix size is 2 x 4 (2 rows, 4 columns)
        int[][] matrix = {
            { 1, 2, 3, 4 }, // row 0 values
            { 5, 6, 7, 8 } // row 1 values
        };

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // print the matrix to the console
        System.out.println(Arrays.deepToString(matrix));
    }
}
