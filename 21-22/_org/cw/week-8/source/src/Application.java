import java.util.Scanner;

public class Application {


    public static final String FORWARD  = "W";
    public static final String BACKWARD = "S";
    public static final String LEFT     = "A";
    public static final String RIGHT    = "D";

    // 0 -> празно пространство
    public static final int TILE =  0;
    // 1 -> героя (змията)
    public static final int SNAKE =  1;
    // 2 -> препятствие
    public static final int OBSTACLE =  2;
    // 3 -> храна
    public static final int ENEMY =  3;

    public static final int FOOD =  4;

    public static int snakeRow = 2;
    public static int snakeCol = 2;

    public static int snakeLastBodyPartRow = -1;
    public static int snakeLastBodyPartCol = -1;


    public static boolean isGameLoopStateRunning = true;

    public static int scoreCount = 0;

//    public static int[][] gameBoard = {
//            { TILE, TILE, TILE, TILE, TILE      },
//            { TILE, TILE, TILE, TILE, TILE  },
//            { TILE, TILE, TILE, TILE, TILE     },
//            { TILE, TILE, SNAKE, TILE, TILE  },
//            { TILE, SNAKE, SNAKE, TILE, TILE      }
//    };


    public static int[][] gameBoard = {
        { TILE, TILE, TILE, FOOD, TILE      },
        { TILE, OBSTACLE, TILE, TILE, TILE  },
        { TILE, TILE, SNAKE, TILE, TILE     },
        { TILE, ENEMY, TILE, TILE, TILE  },
        { TILE, TILE, TILE, FOOD, TILE      }
    };

    public static Scanner inputScanner = new Scanner(System.in);

    public static void render() {
        for(int[] processableRow : gameBoard) {
            for(int element : processableRow) {
                String renderElement = renderGameBoardElement(element);
                System.out.print(renderElement);
            }

            System.out.println();
        }

        System.out.println("============================");
        System.out.println("Score points : " + scoreCount);
        System.out.println("============================");
    }

    public static String renderGameBoardElement(int element) {

        if(element == SNAKE     ) return " S ";
        if(element == FOOD      ) return " $ ";
        if(element == OBSTACLE  ) return " # ";
        if(element == ENEMY  ) return " ^ ";
        return " X ";
    }

    public static boolean isSnakeLongerThanSingleElement() {
        return snakeLastBodyPartRow != -1 &&
                snakeLastBodyPartCol != -1;
    }

    public static int getSecondToLastSnakeBodyPartRow() {

        if(!isOutOfBound(snakeLastBodyPartRow, snakeLastBodyPartCol + 1)) {
            boolean hasRight = gameBoard[snakeLastBodyPartRow][snakeLastBodyPartCol + 1] == SNAKE;
            if(hasRight) return snakeLastBodyPartRow;
        }

        if(!isOutOfBound(snakeLastBodyPartRow + 1, snakeLastBodyPartCol)) {
            boolean hasDown = gameBoard[snakeLastBodyPartRow + 1][snakeLastBodyPartCol] == SNAKE;
            if(hasDown) return snakeLastBodyPartRow + 1;
        }

        if(!isOutOfBound(snakeLastBodyPartRow, snakeLastBodyPartCol - 1)) {
            boolean hasLeft = gameBoard[snakeLastBodyPartRow][snakeLastBodyPartCol - 1] == SNAKE;
            if (hasLeft) return snakeLastBodyPartRow;
        }

        if(!isOutOfBound(snakeLastBodyPartRow - 1, snakeLastBodyPartCol)) {
            boolean hasUp = gameBoard[snakeLastBodyPartRow - 1][snakeLastBodyPartCol] == SNAKE;
            if (hasUp) return snakeLastBodyPartRow - 1;
        }

        return -1;
    }

    public static int getSecondToLastSnakeBodyPartCol() {

        if(!isOutOfBound(snakeLastBodyPartRow, snakeLastBodyPartCol + 1)) {
            boolean hasRight = gameBoard[snakeLastBodyPartRow][snakeLastBodyPartCol + 1] == SNAKE;
            if(hasRight) return snakeLastBodyPartCol + 1;
        }

        if(!isOutOfBound(snakeLastBodyPartRow + 1, snakeLastBodyPartCol)) {
            boolean hasDown = gameBoard[snakeLastBodyPartRow + 1][snakeLastBodyPartCol] == SNAKE;
            if(hasDown) return snakeLastBodyPartCol;
        }

        if(!isOutOfBound(snakeLastBodyPartRow, snakeLastBodyPartCol - 1)) {
            boolean hasLeft = gameBoard[snakeLastBodyPartRow][snakeLastBodyPartCol - 1] == SNAKE;
            if (hasLeft) return snakeLastBodyPartCol - 1;
        }

        if(!isOutOfBound(snakeLastBodyPartRow - 1, snakeLastBodyPartCol)) {
            boolean hasUp = gameBoard[snakeLastBodyPartRow - 1][snakeLastBodyPartCol] == SNAKE;
            if (hasUp) return snakeLastBodyPartCol;
        }

        return -1;
    }

    public static boolean isOutOfBound(int destinationRow, int destinationCol) {

        return  destinationRow < 0                  ||
                destinationCol < 0                  ||
                destinationRow >= gameBoard.length  ||
                destinationCol >= gameBoard.length;
    }


    public static void processMoveSnake(String keyStrokeCode) {

        boolean isProcessable = keyStrokeCode.equalsIgnoreCase(FORWARD)     ||
                                keyStrokeCode.equalsIgnoreCase(BACKWARD)    ||
                                keyStrokeCode.equalsIgnoreCase(LEFT)        ||
                                keyStrokeCode.equalsIgnoreCase(RIGHT);

        if(!isProcessable) return;

        int destinationRow = snakeRow;
        int destinationCol = snakeCol;

        if(keyStrokeCode.equalsIgnoreCase(FORWARD)) {

            // Вариант 0 - не правете така
            // destinationRow = --snakeRow;

            // Вариант 1
            // destinationRow = snakeRow - 1;

            // Вариант 2
            destinationRow--;
        }

        if(keyStrokeCode.equalsIgnoreCase(BACKWARD)) {
            destinationRow++;
        }

        if(keyStrokeCode.equalsIgnoreCase(LEFT)) {
            destinationCol--;
        }

        if(keyStrokeCode.equalsIgnoreCase(RIGHT)) {
            destinationCol++;
        }

        // проверка за гранични зони
        boolean isOutOfBound =  destinationRow < 0                  ||
                                destinationCol < 0                  ||
                                destinationRow >= gameBoard.length  ||
                                destinationCol >= gameBoard.length;
        if(isOutOfBound) return;

        int targetTile = gameBoard[destinationRow][destinationCol];

        // проверка за препятствие
        if(targetTile == OBSTACLE) return;

        // проверка за противник
        if(targetTile == ENEMY) {
            setGameLoopOver();
        }

        // проверка за храна


        // актуализация на игралното поле
        gameBoard[destinationRow][destinationCol]   = SNAKE;

        if(targetTile == FOOD) {
            scoreCount += 10;
            gameBoard[snakeRow][snakeCol] = SNAKE;
            snakeLastBodyPartRow = snakeRow;
            snakeLastBodyPartCol = snakeCol;
        }
        else {

            if(!isSnakeLongerThanSingleElement()) {
                gameBoard[snakeRow][snakeCol] = TILE;
            }

            if(isSnakeLongerThanSingleElement()) {

                gameBoard[snakeLastBodyPartRow][snakeLastBodyPartCol] = TILE;
                snakeLastBodyPartRow = getSecondToLastSnakeBodyPartRow();
                snakeLastBodyPartCol = getSecondToLastSnakeBodyPartCol();
            }
        }

        // актуализация на позицията на змията
        snakeRow = destinationRow;
        snakeCol = destinationCol;
    }

    public static boolean isGameLoopRunning() {
        return isGameLoopStateRunning;
    }

    public static void setGameLoopOver() {
        isGameLoopStateRunning = false;
    }

    public static void main(String[] args) {

        while(isGameLoopRunning()) {

            render();
            String keyStrokeCode = inputScanner.next();
            processMoveSnake(keyStrokeCode);
        }

        System.out.print(" *** Game Over ***");
    }
}
