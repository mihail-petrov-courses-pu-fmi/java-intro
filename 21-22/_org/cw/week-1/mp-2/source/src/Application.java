public class Application {

    public static void main(String[] args) {

        // Задача 1

        // Променлива с присвоен числов литерал
        int avgProductionCount = 10;

        // деклариране
        // инициализиране
        int iceCremeProductionCount = avgProductionCount;

        // присвояване на стойност
        iceCremeProductionCount = 100;
        System.out.println(iceCremeProductionCount);

        // задача 2
        double iceCremePrice = 2.99;

        // задача 3
        String iceCremeName = "EXTREME ICE CREME";

        // 3.1 извеждане на името на продукта и неговата цена
        // 3.1.1 - с помоща на System.out.print
        System.out.print(iceCremeName);
        System.out.print("цена -");
        System.out.println(iceCremePrice);

        // 3.1.2 - с помоща на променлива
        String priceMessage = iceCremeName + " цена - " + iceCremePrice;
        System.out.println(priceMessage);

        // 3.1.3 - с помоща на System.out.format
        System.out.format("%s %s %s", iceCremeName, " цена - ", iceCremePrice);
    }
}
