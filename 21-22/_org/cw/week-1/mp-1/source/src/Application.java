public class Application {

    public static void main(String[] args) {

        // Задача 1
        int firstRoundQuestionCount  = 10;
        int secondRoundQuestionCount = 7;
        int thirdRoundQuestionCount  = 5;
        int finalRoundQuestionCount  = 1;

        // Задача 2
        int firstRoundPoints        = 1;
        // int firstRoundPointCount = 1;
        int secondRoundPoints       = 2;
        int thirdRoundPoints        = 3;
        int finalRoundPoints        = 5;

        int totalPlayerPoints       = 0;
        System.out.println(totalPlayerPoints);

        // Задача 3
        String showName = "Стани за смях";
        // 3.1 - извеждаме текста на шоуто
        System.out.print("Добре дошли в ");
        System.out.println(showName);

        // 3.2 - с помоща на променлива
        // и конкатенация (долепяне)
        String greetingMessage = "Добре дошли в " + showName;
        System.out.println(greetingMessage);

        double hostPayCheckCount = 5000.99;


        // Табличка с точките по кръгове
        String firstRoundPointMessage = "Рунд 1 брой въпроси " + firstRoundQuestionCount + " брой точки" + firstRoundPoints;
        System.out.println(firstRoundPointMessage);

        System.out.println("=========================");
        System.out.format("|%-25s |%s |%s |%s|", "Рунд 1 брой въпроси ", firstRoundQuestionCount, "брой точки", 10 );

    }
}
