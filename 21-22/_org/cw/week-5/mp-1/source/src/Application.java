import java.util.Scanner;

public class Application {

    static int length = 120;

    public static String generateBarCodeFromStringCollection(int digit) {

        int positionIndex   = digit - 1;
        String[] charMap    = {"!", "@", "#", "$", "%"};

        return charMap[positionIndex];
    }

    public static String generateBarCode(char digit) {

        System.out.println(length);

        if(digit == '1') {
            return "@";
        }

        if(digit == '2') {
            return "!";
        }

        if(digit == '3') {
            return "#";
        }

        if(digit == '4') {
            return "^";
        }

        return "&";
    }

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Номер: ");
        String cardNumber = inputScanner.nextLine();
        System.out.println(cardNumber.length());

        for(int i = 0; i < cardNumber.length(); i++) {

            int position   = i + 1;
            boolean isEven = position % 2 == 0;

            if(isEven) {
                System.out.println(cardNumber.charAt(i));
            }
        }

        // cardNumber с масив
        int size = 10;
        char[] cardNumberArray          = new char[size];
        String[] cardNumberCollection   = new String[10];
        for(int i = 0; i < cardNumberArray.length; i++) {

//            String inputElement = inputScanner.next();
//            char element        = inputElement.charAt(0);

            // cardNumberArray[i] = (inputScanner.next()).charAt(0);

            cardNumberCollection[i] = inputScanner.next();
        }


//        char cardNumberArray1;
//        char cardNumberArray2;
//        char cardNumberArray3;
//        char cardNumberArray4;

        // cardNumber[0]
        // String element = new String("1234567894");
        String barCode = "";

//        int index = 0;
//        while(index < cardNumber.length()) {
//
//            char processableDigit = cardNumber.charAt(index);
//            barCode += generateBarCode(processableDigit);
//            index++;
//        }

        for(int i = 0; i < cardNumber.length(); i++ ) {

            char processableDigit = cardNumber.charAt(i);
            barCode += generateBarCode(processableDigit);
        }


        System.out.println(barCode);


    }
}
