import java.util.Scanner;

/**
 * Battle City Game Application
 */
public class Application {

    public static void main(String[] args) {
        // Initialize the scanner class
        Scanner scanner = new Scanner(System.in);

        // Initialize and render/print the game board
        String[][] gameBoard = GameBoardManager.bootstrapGameBoard();
        GameBoardManager.renderGameBoard(gameBoard);

        while (true) {
            System.out.println("Choose direction: ");
            String direction = scanner.nextLine();

            gameBoard = GameBoardManager.movePlayer(direction, gameBoard);
            GameBoardManager.renderGameBoard(gameBoard);
        }
    }
}
