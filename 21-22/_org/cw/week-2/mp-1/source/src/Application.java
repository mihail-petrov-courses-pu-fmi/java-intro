import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // Място за констани
        final int EARLY_ADOPTER_TYPE_LOWER_BOUND = 99;
        final int NORMAL_TYPE_LOWER_BOUND   = 100_000;
        final int NORMAL_TYPE_UPPER_BOUND   = 999_999;
        final String SPECIAL_CUSTOMER_NAME  = "Ivan";

        // int count = 10;
        // boolean isTrue = true;
        // String message = "Hello World";
        // String originalMessage = new String("Hello World")

        Scanner inputScanner = new Scanner(System.in);
        // inputScanner.nextLine()   -> много низове
        // inputScanner.next()       -> едит низ
        // inputScanner.nextInt()    -> цяло число
        // inputScanner.nextDouble() -> дробно число

        System.out.println("Номер на картата:");
        int cardNumber = inputScanner.nextInt();
        System.out.println(cardNumber);


        System.out.println("Как се казваш");
        String customerName =  inputScanner.next();


        // Сравнение : >, <, >=, <=, ==
        // Логически : AND( && ) , OR( || ), NOT(!)

        boolean isCustomerTypeNormal        =   (NORMAL_TYPE_UPPER_BOUND >= cardNumber)
                                                &&
                                                (cardNumber >= NORMAL_TYPE_LOWER_BOUND);
        boolean isCustomerTypeLager         =   (cardNumber > NORMAL_TYPE_UPPER_BOUND);

        boolean isCustomerSpecial           =   !isCustomerTypeLager
                                                &&
                                                !isCustomerTypeNormal;

        boolean isCustomerTypeEarlyAdopter  =   (cardNumber > EARLY_ADOPTER_TYPE_LOWER_BOUND)
                                                &&
                                                isCustomerSpecial;

        boolean isPremiumCustomer           = customerName.equals(SPECIAL_CUSTOMER_NAME);

        if(isCustomerTypeEarlyAdopter) {
            System.out.println("Ти си ЕА");
        }

        if(isCustomerTypeNormal) {
            System.out.println("Ти си нормален");
        }

        if(isCustomerTypeLager) {
            System.out.println("Ти си последен в играта");
        }

        System.out.println("Здрасти " + customerName);
        if(isPremiumCustomer) {
            System.out.println("ТИ си специален");
        }
        else {
            System.out.println("Направи порчка");
        }

    }
}
