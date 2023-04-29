import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] arsg) {

        final int VOTER_TYPE_POOR_UPPER_BOUND = 99;
        final int VOTER_TYPE_NORMAL_LOWER_BOUND = 100_000;
        final int VOTER_TYPE_NORMAL_UPPER_BOUND = 999_999;

        final int TAX_EVADING_CATEGORY = 3;

        final int STATE_WORKING     = 1;
        final int STATE_PROBLEMATIC = 2;
        final int STATE_FAILED      = 3;

        Random randomGenerator = new Random();
        Scanner inputScanner = new Scanner(System.in);

        int applicationState = (randomGenerator.nextInt(3) + 1);
        boolean isStateServisable   = applicationState == STATE_WORKING;
        boolean isStateProblematic  = applicationState == STATE_PROBLEMATIC;
        boolean isStateOutOfService = applicationState == STATE_FAILED;

        if(isStateServisable) {
            System.out.println("Машината работи нормално");
        }

        if(isStateProblematic) {
            System.out.println("Машината работи понякога");
        }

        if(isStateOutOfService) {
            System.out.println("Машината не работи");
        }

        switch (applicationState) {
            case STATE_WORKING      -> System.out.println("Машината работи нормално");
            case STATE_PROBLEMATIC  -> System.out.println("Машината работи понякога");
            case STATE_FAILED       -> System.out.println("Машината не работи");
        }

        // Задача 1
        System.out.println("Ваведи номера на картата си");
        int cardNumber = inputScanner.nextInt();

        boolean isVoterRich = cardNumber > VOTER_TYPE_NORMAL_UPPER_BOUND;
        boolean isVoterNormal = cardNumber >= VOTER_TYPE_NORMAL_LOWER_BOUND
                && cardNumber <= VOTER_TYPE_NORMAL_UPPER_BOUND;
        boolean isVoterPrivileged = isVoterRich || isVoterNormal;
        boolean isVoterPoor = !isVoterPrivileged
                && (cardNumber > VOTER_TYPE_POOR_UPPER_BOUND);

        if (isVoterPoor) {
            System.out.println("Хайде по-бързо и да те няма");
        }

        if (isVoterNormal) {
            System.out.println("Радваме се, че нормални хора вече гласуват");
        }

        if (isVoterRich) {
            System.out.println("Има за нас, има и за вас");
        }

        boolean isVoterVip = (cardNumber % 2) == 0;

        int cardNumberWithoutLastDigit = cardNumber / 10;
        int taxRelatedDigit = cardNumberWithoutLastDigit % 10;
        boolean isVoterTaxEvader = taxRelatedDigit > TAX_EVADING_CATEGORY;

        if (isVoterTaxEvader) {

            System.out.println("Укриваш ли данаци ? - Y/N");
            String questionAnswer = inputScanner.next();

//            if(questionAnswer.equals("Y")) {
//                System.out.println("Браво моето момче");
//            }
//
//            if(questionAnswer.equals("N")) {
//                System.out.println("Будала");
//            }

//            if(questionAnswer.equals("Y")) {
//                System.out.println("Браво моето момче");
//            }
//            else {
//                System.out.println("Будала");
//            }

            String message = (questionAnswer.equals("Y"))
                            ? "Браво моето момче"
                            : "Будала";
            System.out.println(message);


        }
    }
}
