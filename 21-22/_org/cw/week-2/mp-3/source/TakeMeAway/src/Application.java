import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        // Място за вашите константи
        final int EARLY_ADOPTER_TYPE_UPPER_BOUND    = 99;
        final int NORMAL_TYPE_LOWER_BOUND           = 999_99;
        final int NORMA_TYPE_UPPER_BOUND            = 1_000_000;

        final double ORDER_BURGER_PRICE                   = 10.0;
        final double ORDER_SALAD_PRICE                    = 17.0;
        final double ORDER_DESSERT_PRICE                  = 5.68;

        final double EARLY_ADOPTER_TYPE_PRICE_COEFFICIENT = 0.5;
        final double NORMAL_TYPE_PRICE_COEFFICIENT        = 0;
        final double LAGER_TYPE_PRICE_COEFFICIENT         = 0.8;

        final int ORDER_TYPE_BURGER                       = 1;
        final int ORDER_TYPE_SALAD                        = 2;
        final int ORDER_TYPE_DESSERT                      = 3;

        final String SPECIAL_CUSTOMER_NAME                = "Pesho";

        double totalOrderAmount                           = 0;

        // Задача 1
        Scanner inputScanner = new Scanner(System.in);
        String literal = "HelloWorld";
        String objectLiteral = new String("HelloWorld");

        //
        System.out.println("Как се казваш ? ");
        String customerName = inputScanner.nextLine();
        // boolean doesCustomerHaveSpecialName = customerName.equals(SPECIAL_CUSTOMER_NAME);
        boolean doesCustomerHaveSpecialName = customerName == "Pesho"; // false
        boolean isCustomerNamePesho = ("Pesho" == "Pesho"); // true
        String name = "Pesho";

        System.out.println(doesCustomerHaveSpecialName);
        System.out.println(isCustomerNamePesho);
        boolean isCustomerPesho = name == "Pesho";
        System.out.println(isCustomerPesho);

        System.out.println("Въведете номера на картата: ");
        int cardNumber = inputScanner.nextInt();
        System.out.println("Вие въведохте " + cardNumber);





        // Оператори за сравнение
        // > , <, ==, >=, <=, !=

        // Оператори за логика
        // &&, || , !

        // Аритметични оператори
        // +, -, /, *

        boolean isCustomerLager         = cardNumber >= NORMA_TYPE_UPPER_BOUND;
        boolean isCustomerNormal        =   (cardNumber > NORMAL_TYPE_LOWER_BOUND)
                                            &&
                                            (cardNumber < NORMA_TYPE_UPPER_BOUND);

        boolean isCustomerSpecial       =   !isCustomerLager
                                            &&
                                            !isCustomerNormal;
        boolean isCustomerEarlyAdopter  =   (cardNumber > EARLY_ADOPTER_TYPE_UPPER_BOUND)
                                            &&
                                            isCustomerSpecial;

        if(isCustomerLager) {
            System.out.println("Вие сте клиент от тип LAGGER");
        }

        if(isCustomerNormal) {
            System.out.println("Вие сте клиент от тип NORMAL");
        }

        if(isCustomerEarlyAdopter) {
            System.out.println("Вие сте специален клиент");
        }

        System.out.println("Изберете от нашето меньо");
        System.out.println("1. Бургер");
        System.out.println("2. Салата");
        System.out.println("3. Десерт");

        int orderId =  inputScanner.nextInt();
        boolean isOrderBurger   = (orderId == ORDER_TYPE_BURGER);
        boolean isOrderSalad    = (orderId == ORDER_TYPE_SALAD);
        boolean isOrderDessert  = (orderId == ORDER_TYPE_DESSERT);

        if(isOrderBurger) {

            if(isCustomerEarlyAdopter) {
                totalOrderAmount = ORDER_BURGER_PRICE - (ORDER_BURGER_PRICE * EARLY_ADOPTER_TYPE_PRICE_COEFFICIENT);
            }

            if(isCustomerNormal) {
                totalOrderAmount = ORDER_BURGER_PRICE - (ORDER_BURGER_PRICE * NORMAL_TYPE_PRICE_COEFFICIENT);
            }

            if(isCustomerLager) {
                totalOrderAmount = ORDER_BURGER_PRICE - (ORDER_BURGER_PRICE * LAGER_TYPE_PRICE_COEFFICIENT);
            }
        }

        if(isOrderSalad) {

            if(isCustomerEarlyAdopter) {
                totalOrderAmount = ORDER_SALAD_PRICE - (ORDER_SALAD_PRICE * EARLY_ADOPTER_TYPE_PRICE_COEFFICIENT);
            }

            if(isCustomerNormal) {
                totalOrderAmount = ORDER_SALAD_PRICE - (ORDER_SALAD_PRICE * NORMAL_TYPE_PRICE_COEFFICIENT);
            }

            if(isCustomerLager) {
                totalOrderAmount = ORDER_SALAD_PRICE - (ORDER_SALAD_PRICE * LAGER_TYPE_PRICE_COEFFICIENT);
            }
        }

        if(isOrderDessert) {

            if(isCustomerEarlyAdopter) {
                totalOrderAmount = ORDER_DESSERT_PRICE - (ORDER_DESSERT_PRICE * EARLY_ADOPTER_TYPE_PRICE_COEFFICIENT);
            }

            if(isCustomerNormal) {
                totalOrderAmount = ORDER_DESSERT_PRICE - (ORDER_DESSERT_PRICE * NORMAL_TYPE_PRICE_COEFFICIENT);
            }

            if(isCustomerLager) {
                totalOrderAmount = ORDER_DESSERT_PRICE - (ORDER_DESSERT_PRICE * LAGER_TYPE_PRICE_COEFFICIENT);
            }
        }





        // int / double / String / boolean



    }
}
