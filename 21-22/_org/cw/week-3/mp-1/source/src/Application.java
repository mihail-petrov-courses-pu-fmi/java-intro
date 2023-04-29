import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        final int VOTER_TYPE_POOR_UPPER_BOUND = 99;
        final int VOTER_TYPE_NORMAL_UPPER_BOUND = 999_999;
        final int VOTER_TYPE_NORMAL_LOWER_BOUND = 100_000;

        final int TAX_EVADER_CARD_NUMBER_ID = 3;

        Scanner inputScanner = new Scanner(System.in);
        Random randomGenerator = new Random();
        System.out.println("Въведете номера на вашата карта");
        int cardNumber = inputScanner.nextInt();


        int operationState = randomGenerator.nextInt(4);

        switch (operationState) {
            case 0 :
                System.out.println("Нямам идея");
                break;
            case 1 :
                System.out.println("Машината работи");
                break;
            case 2 :
                System.out.println("Машината има проблеми - Внимавай");
                break;
            case 3:
                System.out.println("Машината не работи");
                break;
        }

//        switch (operationState) {
//            case 0 -> System.out.println("Нямам идея");
//            case 1 -> System.out.println("Машината работи");
//            case 2 -> System.out.println("Машината има проблеми - Внимавай");
//            case 3 -> System.out.println("Машината не работи");
//        }



        // Видове гласуващи
        // - повече от две цифри - POOR
        // - повече от 6 цифри   - RICH
        // - точно 6 цифри       - NORMAL

        boolean isVoterRich   = cardNumber >  VOTER_TYPE_NORMAL_UPPER_BOUND;
        boolean isVoterNormal = cardNumber >= VOTER_TYPE_NORMAL_LOWER_BOUND &&
                                cardNumber <= VOTER_TYPE_NORMAL_UPPER_BOUND;
        boolean isVoterPrivileged = isVoterRich || isVoterNormal;
        boolean isVoterPoor   = !isVoterPrivileged &&
                                (cardNumber >  VOTER_TYPE_POOR_UPPER_BOUND);

        if(isVoterPoor) {
            System.out.println("Хайде по-бързо и да те няма");
        }
        else if(isVoterNormal) {
            System.out.println("Радваме се, че нормални хора вече гласуват");
        }
        else if(isVoterRich) {
            System.out.println("Има за нас, има и за вас");
        }

        boolean isVoterVip = (cardNumber % 2) == 0;

        // Взима числото на картата и маха последната цифра от него
        // Пример 1234 -> 123.4 -> 123 целочислен резултат
        int numberWithoutLastCardDigit  = (cardNumber / 10);
        int lastCardNumberDigit         = (numberWithoutLastCardDigit % 10);

        boolean isVoterPotentialTaxEvader = lastCardNumberDigit > TAX_EVADER_CARD_NUMBER_ID;
        if(isVoterPotentialTaxEvader) {
            System.out.println("Укриваш ли данъци - Y/N");
            String taxEvaderAnswer = inputScanner.next();

            String message = (taxEvaderAnswer.equals("Y"))
                            ? "Браво моето момче"
                            : "Будала";
            System.out.println(message);
        }
    }
}