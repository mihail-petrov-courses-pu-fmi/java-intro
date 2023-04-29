public class Application {

    public static void main(String[] args) {

        // Задача 1
        System.out.println("Мазе бот v1 на вашите услуги");

        // Задача 2
        String userFirstName    = "Mihail";
        String userLastName     = "Petrov";
        String userUniqueId     = "1101261005";
        int userAge             = 29;

        // Задача 3
        System.out.println("Добре дошъл в мазето на баба " + userFirstName + " " + userLastName);
        System.out.println("Ти се идентифицира с номер " + userUniqueId);
        System.out.println("Ти си на  " + userAge + " години");

        // Задача 4
        // направете променлива, която да съдържа името и качеството на продукта
        // и го отразете в променлива
        String appleWineProductTitle        = "ябълково вино";
        String smokedMeatProductTitle       = "пушено месо";
        String plumJamProductTitle          = "сливов мармалад";
        String marinatedPepperProductTitle  = "мариновани чушки";
        String piggyBankProductTitle        = "прасенце касичка";

        // Задача 5
        int wineProductCount       = 10;
        int meatProductCount       = 5;
        int jamProductCount        = 9;
        int pepperProductCount     = 4;
        double bankProductAmount   = 184.35;

        // Задача 6
        String wineSerialNumber     = "C7544_" + wineProductCount;
        String meatSerialNumber     = "M7441_" + meatProductCount;
        String jamSerialNumber      = "S6491_" + jamProductCount;
        String pepperSerialNumber   = "P7485_" + pepperProductCount;
        String bankSerialNumber     = "B6584_" + bankProductAmount;

        // Задача 7
        // Изведете в конзолата всички продукти, тяхното количество и сериен номер
        // под формата на табличка

        String format    = "|%-20s|%-10s|%-20s|";
        String separator = "======================================================";
        System.out.println("Отчет за продуктите в мазето");
        System.out.println(separator);
        System.out.format(format, "продукт", "брой", "нов сериен номер");
        System.out.println();
        System.out.println(separator);
        System.out.format(format, appleWineProductTitle, wineProductCount, wineSerialNumber);
        System.out.println();
        System.out.format(format, smokedMeatProductTitle, meatProductCount, meatSerialNumber);
        System.out.println();
        System.out.format(format, plumJamProductTitle, jamProductCount, jamSerialNumber);
        System.out.println();
        System.out.format(format, marinatedPepperProductTitle, pepperProductCount, pepperSerialNumber);
        System.out.println();
        System.out.format(format, piggyBankProductTitle, bankProductAmount, bankSerialNumber);
        System.out.println();
        System.out.println(separator);
    }
}
