import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        // Място за константи
        final int EARLY_ADOPTER_TYPE_LOWER_BOUND  = 99;
        final int NORMAL_TYPE_LOWER_BOUND         = 100_000;
        final int NORMAL_TYPE_UPPER_BOUND         = 999_999;
        final String SPECIAL_NAME                 = "Иван";

        // inputScanner.next()          -> String
        // inputScanner.nextLine()      -> multy String
        // inputScanner.nextInt()       -> int
        // inputScanner.nextDouble()    -> double
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Номер на картата");
        int cardNumber =  inputScanner.nextInt();

        System.out.println("Как се казваш");
        String customerName = inputScanner.next();


        boolean isTypeLager         = cardNumber > NORMAL_TYPE_UPPER_BOUND;
        boolean isTypeNormal        = (NORMAL_TYPE_LOWER_BOUND <= cardNumber)
                                      &&
                                      (cardNumber <= NORMAL_TYPE_UPPER_BOUND);

        boolean isTypeSpecial       =   !isTypeLager
                                        &&
                                        !isTypeNormal;

        boolean isTypeNotSpecial    = !isTypeSpecial;

        boolean isTypeEarlyAdopter  =   (cardNumber > EARLY_ADOPTER_TYPE_LOWER_BOUND)
                                        &&
                                        isTypeSpecial;

        boolean isSpecialCustomerName = customerName.equals(SPECIAL_NAME);

        if(isTypeEarlyAdopter) {
            System.out.println("Здрасти ти си топа");
        }

        if(isTypeNormal) {
            System.out.println("Добре дошли");
        }

        if(isTypeLager) {
            System.out.println("Не ми пука за теб");
        }


        if(isSpecialCustomerName) {
            System.out.println("Честит имен ден");
        }
        else {
            System.out.println("Време за порчка");
        }


        System.out.println(cardNumber);




    }
}
