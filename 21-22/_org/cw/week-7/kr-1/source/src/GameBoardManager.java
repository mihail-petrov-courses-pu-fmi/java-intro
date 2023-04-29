public class GameBoardManager {

    // Constants
    private static final int GAME_BOARD_ROW_COUNT = 10;
    private static final int GAME_BOARD_COL_COUNT = 10;

    private static final String UNIT_TERRAIN    = ".";
    private static final String UNIT_PLAYER     = "%";
    private static final String UNIT_OBSTACLE   = "#";

    private static final String DIRECTION_FORWARD   = "w";
    private static final String DIRECTION_BACKWARD  = "s";
    private static final String DIRECTION_LEFT      = "a";
    private static final String DIRECTION_RIGHT     = "d";

    private static int playerRow;
    private static int playerCol;

    // 0. Create game board
    public static String[][] bootstrapGameBoard() {

        String[][] gameBoard = new String[GAME_BOARD_ROW_COUNT][GAME_BOARD_COL_COUNT];

        gameBoard = generatePassableTerrain(gameBoard);
        gameBoard = generatePlayerTank(gameBoard);
        gameBoard = generateObstacles(gameBoard);

        return gameBoard;
    }

    public static String[][] generatePassableTerrain(String[][] gameBoard) {

        for (int row = 0; row < gameBoard.length; row++) {

            for (int col = 0; col < gameBoard[row].length; col++) {
                gameBoard[row][col] = UNIT_TERRAIN;
            }
        }

        return gameBoard;
    }

    public static String[][] generatePlayerTank(String[][] gameBoard) {
        // initialize player initial coordinates
        playerRow = (GAME_BOARD_ROW_COUNT - 1);
        playerCol = RandomGenerator.generate(GAME_BOARD_COL_COUNT);

        gameBoard[playerRow][playerCol] = UNIT_PLAYER;

        return gameBoard;
    }

    public static String[][] generateObstacles(String[][] gameBoard) {
        // generate obstacles only from row index 3 to row index 6
        final int OBSTACLE_START_INDEX  = 3;
        final int OBSTACLE_END_INDEX    = 6;

        for (int row = OBSTACLE_START_INDEX; row < OBSTACLE_END_INDEX; row++) {
            for (int col = 0; col < GAME_BOARD_COL_COUNT; col++) {
                if (isPlacementOfObstaclePossible()) {
                    gameBoard[row][col] = UNIT_OBSTACLE;
                }
            }
        }

        return gameBoard;
    }

    private static boolean isPlacementOfObstaclePossible() {

        int chanceToPlaceObstacle = RandomGenerator.generate(6);
        return chanceToPlaceObstacle == 1;
    }

    // 1. Print and visualize the game board
    public static void renderGameBoard(String[][] gameBoard) {

        for (int row = 0; row < gameBoard.length; row++) {

            for (int col = 0; col < gameBoard[row].length; col++) {
                System.out.print(" " + gameBoard[row][col]);
            }

            System.out.println();
        }
    }

    // 2. Player movement
    public static String[][] movePlayer(String direction, String[][] gameBoard) {

        int playerCurrentRow = playerRow;
        int playerCurrentCol = playerCol;

        if (direction.equals(DIRECTION_FORWARD)) {
            playerCurrentRow = playerCurrentRow - 1;
        }

        if (direction.equals(DIRECTION_BACKWARD)) {
            playerCurrentRow = playerCurrentRow + 1;
        }

        if (direction.equals(DIRECTION_LEFT)) {
            playerCurrentCol = playerCurrentCol - 1;
        }

        if (direction.equals(DIRECTION_RIGHT)) {
            playerCurrentCol = playerCurrentCol + 1;
        }

        // replace the old player coordinates with the terrain value
        gameBoard[playerRow][playerCol] = UNIT_TERRAIN;

        // assign the new coordinates of the player
        playerRow = playerCurrentRow;
        playerCol = playerCurrentCol;

        // move the player to the new coordinates
        gameBoard[playerRow][playerCol] = UNIT_PLAYER;

        return gameBoard;
    }
}
