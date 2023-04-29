/**
 * @author konstantin.rusev
 */
public class Application {

    // One line comment

    /*
     * Multiple lines comment
     */

    /**
     * Java doc comment
     */

    public static void main(String[] args) {

        // It's not possible to create variables with same names
        // int daysOfWeek = 7;
        // int daysOfWeek = 5;

        String dayMonday    = "Monday";
        String dayTuesday   = "Tuesday";
        String dayWednesday = "Wednesday";
        String dayThursday  = "Thursday";
        String dayFriday    = "Friday";
        String daySaturday  = "Saturday";
        String daySunday    = "Sunday";

        boolean isOpenedOnMonday    = true;
        boolean isOpenedOnTuesday   = true;
        boolean isOpenedOnWednesday = true;
        boolean isOpenedOnThursday  = true;
        boolean isOpenedOnFriday    = true;
        boolean isOpenedOnSaturday  = false;
        boolean isOpenedOnSunday    = false;

        int visitorsOnMonday    = 1000;
        int visitorsOnTuesday   = 2000;
        int visitorsOnWednesday = 3000;
        int visitorsOnThursday  = 4000;
        int visitorsOnFriday    = 5000;

        double totalPriceMonday    = 1205.5;
        double totalPriceTuesday   = 2205.5;
        double totalPriceWednesday = 3205.5;
        double totalPriceThursday  = 4205.5;
        double totalPriceFriday    = 5205.5;

        String format    = "||%-10s||%-10s||%-10s||%-10s||";
        String dash      = "-";
        String separator = "--------------------------------------------------";

        System.out.println(separator);
        System.out.println("----------------- Theatre report -----------------");
        System.out.println(separator);
        System.out.format(format, "day", "opened", "visitors", "price");
        System.out.println();
        System.out.println(separator);

        System.out.format(format, dayMonday, isOpenedOnMonday, visitorsOnMonday, totalPriceMonday);
        System.out.println();

        System.out.format(format, dayTuesday, isOpenedOnTuesday, visitorsOnTuesday, totalPriceTuesday);
        System.out.println();

        System.out.format(format, dayWednesday, isOpenedOnWednesday, visitorsOnWednesday, totalPriceWednesday);
        System.out.println();

        System.out.format(format, dayWednesday, isOpenedOnWednesday, visitorsOnWednesday, totalPriceWednesday);
        System.out.println();

        System.out.format(format, dayThursday, isOpenedOnThursday, visitorsOnThursday, totalPriceThursday);
        System.out.println();

        System.out.format(format, dayFriday, isOpenedOnFriday, visitorsOnFriday, totalPriceFriday);
        System.out.println();

        System.out.format(format, daySaturday, isOpenedOnSaturday, dash, dash);
        System.out.println();

        System.out.format(format, daySunday, isOpenedOnSunday, dash, dash);
        System.out.println();
    }
}
