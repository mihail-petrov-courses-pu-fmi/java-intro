import java.util.Scanner;

public class Application {

    static final int GLOBAL_VARIABLE = 10;

    public static String generateBarCodeElement(int digit) {

        int positionIndex     = (digit - 1);
        String[] characterMap = {"*", "$", "%", "^"};

        if(positionIndex > characterMap.length ) {
            return "@";
        }

        return characterMap[positionIndex];
    }

    public static String generateBarCodeElement(char digit) {

        if(digit == '1') {
            return "*";
        }

        if(digit == '2') {
            return "$";
        }

        if(digit == '3') {
            return "%";
        }

        if(digit == '4') {
            return "^";
        }

        return "%";
    }

    public static void main(String[] args) {

        Scanner inputScanner = new Scanner(System.in);

        int cardNumber  = 12345;
        int size = 10;
        String[] cardNumberArray = new String[size];

        for(int i = 0; i < cardNumberArray.length; i++) {
            System.out.println("Въведете номер на позициа " + ( i + 1) + ":");
            cardNumberArray[i] = inputScanner.next();
        }

        System.out.println(cardNumberArray[0]);

        String result = "";
        for(int i = 0; i < cardNumberArray.length; i++) {
            result += cardNumberArray[i];
        }

        System.out.println(result);

//        int firstDigit  = 1;
//        int secondDigit = 2;
//        int thirdDigit  = 3;
//        int fourthDigit = 4;
//        int fifthDigit  = 5;

        String barCode = "";
//        barCode += generateBarCodeElement(firstDigit);
//        barCode += generateBarCodeElement(secondDigit);
//        barCode += generateBarCodeElement(thirdDigit);
//        barCode += generateBarCodeElement(fourthDigit);
//        barCode += generateBarCodeElement(fifthDigit);

        String stringCardNumber = cardNumber + "";
        int index = 0;

//        String sampleString = "SAMPLE";
//        String sampleStringObject = new String("SAMPLE");

//        while(index < stringCardNumber.length()) {
//
//            char processableCharacter =  stringCardNumber.charAt(index);
//            barCode += generateBarCodeElement(processableCharacter);
//            index++;
//        }

        for(int i = 0; i < stringCardNumber.length(); i++ ) {

            char processableCharacter =  stringCardNumber.charAt(index);
            barCode += generateBarCodeElement(processableCharacter);
        }

        System.out.println(barCode);


    }
}

