public class Application {

    public static int findMax(int[] collection) {

        int maxNumber = collection[0];
        for(int i = 1; i < collection.length; i++) {

            int currentNumber  = collection[i];

            if(currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }
        }

        return maxNumber;
    }

    public static int[] sort(int[] collection) {

        for(int i = 0; i < collection.length; i++) {
            for(int j = 0; j < collection.length - 1; j++) {

                int leftHandValue = collection[j];
                int rightHandValue = collection[j + 1];

                if(leftHandValue > rightHandValue) {
                    collection[j] = rightHandValue;
                    collection[j + 1] = leftHandValue;
                }
            }
        }

        return collection;
    }


    public static void main(String[] args) {

        int[] collection = {33,8,25,72,7,48,19};
        int[] result = sort(collection);
        System.out.println(result);


        // int[][] collection = new int[10][5];
//        int[][] collection = {
//                { 1, 2, 3 },
//                { 5, 6, 7, 8 },
//                { 9 }
//        };
//
//        for(int row = 0; row < collection.length; row++) {
//
//            int[] processableRowCollection = collection[row];
//
//            for(int col = 0; col < processableRowCollection.length; col++) {
//                // System.out.print(processableRowCollection[col]);
//                System.out.print(collection[row][col]);
//            }
//            System.out.println();
//        }
    }
}
