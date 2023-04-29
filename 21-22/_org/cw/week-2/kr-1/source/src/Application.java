// package
import java.util.Scanner;

public class Application {

    // Теми за седмица 2
    // 1. вход и изход от конзолата
    // 2. аритметични оператори (+, -, /, *, %)
    // 3. съкратен запис на аритметични оператори с повтарящ се операнд (++, --)
    // 4. логически оператори AND и OR (&&, ||)
    // 5. оператори за сравнение (==, >, <, >=, <=)
    // 6. троен (тернарен) оператор (?:)
    // 7. Пример с if-else конструкция
    // 8. специфични особености при сравнение на низове (equals())

    public static void main(String[] args) {

        // declaration of constants that will be used to evaluate the type of the restaurant
        final int BULGARIAN_RESTAURANT_NUMBER   = 1;
        final int ITALIAN_RESTAURANT_NUMBER     = 2;
        final int TURKISH_RESTAURANT_NUMBER     = 3;

        final String DEFAULT_RESTAURANT_TYPE     = "NO SPECIFIC TYPE";
        final String BULGARIAN_RESTAURANT_TYPE   = "BULGARIAN";
        final String ITALIAN_RESTAURANT_TYPE     = "ITALIAN";
        final String TURKISH_RESTAURANT_TYPE     = "TURKISH";

        System.out.println("Welcome to the Plovdiv Delivery");
        System.out.println("Please choose a restaurant!");
        System.out.println(BULGARIAN_RESTAURANT_NUMBER + " - for Bulgarian restaurant.");
        System.out.println(ITALIAN_RESTAURANT_NUMBER + " - for Italian restaurant.");
        System.out.println(TURKISH_RESTAURANT_NUMBER + " - for Turkish restaurant.");

        Scanner scanner = new Scanner(System.in);

        // nextInt() is a function/method which returns a value of type int
        // nextLine() is a function/method which returns a value of type String
        int restaurantNumber = scanner.nextInt();
        System.out.println("You entered: " + restaurantNumber);

        // difference between: > and >=, < and <=
        // && - logical AND, || - logical OR
        boolean isValidRestaurant = restaurantNumber >= BULGARIAN_RESTAURANT_NUMBER &&
                                    restaurantNumber <= TURKISH_RESTAURANT_NUMBER;

        // ternary operator check between two values
        String validRestaurant = (isValidRestaurant) ? "YES" : "NO";
        System.out.println("Is valid restaurant: " + validRestaurant);

        boolean isBulgarianRestaurant = restaurantNumber == BULGARIAN_RESTAURANT_NUMBER;
        boolean isItalianRestaurant = restaurantNumber == ITALIAN_RESTAURANT_NUMBER;
        boolean isTurkishRestaurant = restaurantNumber == TURKISH_RESTAURANT_NUMBER;

        String restaurantType = (isBulgarianRestaurant) ? BULGARIAN_RESTAURANT_TYPE :
                                (isItalianRestaurant) ? ITALIAN_RESTAURANT_TYPE :
                                (isTurkishRestaurant) ? TURKISH_RESTAURANT_TYPE :
                                DEFAULT_RESTAURANT_TYPE;

        System.out.println("The chosen restaurant is of type: " + restaurantType);

        System.out.println("The menu of the " + restaurantType + " restaurant is provided below.");
        if (restaurantType.equals(BULGARIAN_RESTAURANT_TYPE)) {
            System.out.println("(1) Chicken soup");
            System.out.println("(2) Shopska salad");
            System.out.println("(3) Slice of Bread");

            int orderNumber = scanner.nextInt();

            String orderName = (orderNumber == 1) ? "Chicken soup" :
                               (orderNumber == 2) ? "Shopska salad" :
                               (orderNumber == 3) ? "Slice of Bread" :
                               "We don't have this item in our menu! Please try again!";

            double orderPrice = (orderNumber == 1) ? 5.50 :
                                (orderNumber == 2) ? 9.80 :
                                (orderNumber == 3) ? 0.50 :
                                0.00;

            System.out.println("Selected item: " + orderName + ", price: " + orderPrice);
        } else if (restaurantType.equals(ITALIAN_RESTAURANT_TYPE)) {
            System.out.println("(1) Pizza Margherita");
            System.out.println("(2) Pasta Bolognese");
            System.out.println("(3) Pasta Carbonara ");

            // TODO
        } else if (restaurantType.equals(TURKISH_RESTAURANT_TYPE)) {
            System.out.println("(1) Baklava");
            System.out.println("(2) Adana kebab");
            System.out.println("(3) Rise with milk");

            // TODO
        } else {
            // TODO: Extend the functionality with adding more restaurants
            System.out.println("There's no menu for this restaurant type!");
        }
    }
}
