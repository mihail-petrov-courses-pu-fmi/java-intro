import java.util.Scanner;

public class Application {

    // получавам входни данни
    // врьщам резултат
    public static boolean isEven(int number) {

        // return number % 2 == 0;

        boolean isNumberEvent = number % 2 == 0;
        return isNumberEvent;
        // boolean isCustomerVip = cardNumber % 2 == 0;
    }

    public static boolean isCustomerRich(int cardNumber) {

        final int CUSTOMER_TYPE_RICH_UPPER_BOUND    = 999_999;
        return cardNumber > CUSTOMER_TYPE_RICH_UPPER_BOUND;
    }

    public static void showWelcomeMessageToRichVoter() {
        System.out.println("Има за нас, има и за вас");
    }

    public static boolean isVoteValid(int partyNumberId) {

        return  (partyNumberId == 1) ||
                (partyNumberId == 27) ||
                (partyNumberId == 666) ||
                (partyNumberId == 999);
    }

    public static void main(String[] args) {

        final int CUSTOMER_TYPE_POOR_UPPER_BOUND    = 99;
        final int CUSTOMER_TYPE_RICH_UPPER_BOUND    = 999_999;
        final int CUSTOMER_TYPE_NORMAL_LOWER_BOUND  = 100_000;
        final int TAX_EVADING_COEFICIENT            = 3;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Въведете номера на картата за гласуване");
        int cardNumber = inputScanner.nextInt();

        boolean isCustomerRich      =   cardNumber > CUSTOMER_TYPE_RICH_UPPER_BOUND;
        boolean isCustomerNormal    =   cardNumber <= CUSTOMER_TYPE_RICH_UPPER_BOUND &&
                                        cardNumber >= CUSTOMER_TYPE_NORMAL_LOWER_BOUND;
        boolean isCustomerSpecial   =   isCustomerNormal || isCustomerRich;
//      boolean isCustomerPoor      =   cardNumber > CUSTOMER_TYPE_POOR_UPPER_BOUND &&
//                cardNumber < CUSTOMER_TYPE_NORMAL_LOWER_BOUND;
        boolean isCustomerPoor      =   !isCustomerSpecial &&
                                        cardNumber > CUSTOMER_TYPE_POOR_UPPER_BOUND;

        if(isCustomerRich(cardNumber)) {
            showWelcomeMessageToRichVoter();
        }

        if(isCustomerNormal) {
            String message = "Радваме се, че нормални хора вече гласуват";
            System.out.println(message);
        }

        if(isCustomerPoor) {
            System.out.println("Хайде по-бързо и да те няма");
        }

        boolean isCustomerVip = isEven(cardNumber);

        int nextToLastCardNumberDigit   = (cardNumber / 10) % 10;
        boolean isPotentialTaxEvader    = nextToLastCardNumberDigit > TAX_EVADING_COEFICIENT;

        boolean isVoteValid = false;
        while(!isVoteValid) {

            System.out.println("Моля изберете номер на партия");
            System.out.println("1");
            System.out.println("27");
            System.out.println("666");
            System.out.println("999");

            int partyNumberId   = inputScanner.nextInt();
            isVoteValid         = isVoteValid(partyNumberId);

            String message = isVoteValid ? "Гласувахте успешно" : "Опитаи пак";
            System.out.println(message);
        }


        while(true) {

            System.out.println("Моля изберете номер на партия");
            System.out.println("1");
            System.out.println("27");
            System.out.println("666");
            System.out.println("999");

            int partyNumberId   = inputScanner.nextInt();
            boolean isVotValid  =   (partyNumberId == 1) ||
                                    (partyNumberId == 27) ||
                                    (partyNumberId == 666) ||
                                    (partyNumberId == 999);

            String message = isVoteValid ? "Гласувахте успешно" : "Опитаи пак";
            System.out.println(message);

            if(isVotValid) {
                break;
            }
        }
    }
}