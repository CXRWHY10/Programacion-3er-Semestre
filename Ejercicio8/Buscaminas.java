package Ejercicio8;

import java.util.*;

public class Buscaminas {

    static int boxes = 8;
    static int mines = 10;

    static Scanner sc;
    static Random ran;

    static int[][] board;
    static boolean[][] boardPlayer;
    static boolean[][] flags;

    static int[] ranMinesX;
    static int[] ranMinesY;

    static boolean gameOver;

    public Buscaminas(){

        board = new int[boxes][boxes];
        boardPlayer = new boolean[boxes][boxes];
        flags = new boolean[boxes][boxes];

        ranMinesX = new int[mines];
        ranMinesY = new int[mines];

        sc = new Scanner(System.in);
        ran = new Random();

        gameOver = false;

    }

    public static void fillMines() {
        for (int i = 0; i < mines; i++) {
            int x, y;
            do {
                x = ran.nextInt(boxes);
                y = ran.nextInt(boxes);
            } while (hasMine(x, y));

            ranMinesX[i] = x;
            ranMinesY[i] = y;
        }
    }

    private static boolean hasMine(int x, int y) {
        for (int i = 0; i < mines; i++) {
            if (ranMinesX[i] == x && ranMinesY[i] == y) {
                return true;
            }
        }
        return false;
    }

    public static void fillBoard(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = -1;
            }
        }
    }

    public static void fillBoardMines(){
        for (int i = 0; i < mines; i++) {
            board[ranMinesX[i]][ranMinesY[i]] = 0;
        }
    }

    public static void play(String input) {
        if (input.length() < 1) return;

        boolean isFlag = input.charAt(0) == 'b' || input.charAt(0) == 'B';

        try {
            int x, y;
            if (isFlag && input.length() > 2) {
                x = Character.getNumericValue(input.charAt(1));
                y = Character.getNumericValue(input.charAt(2));
            } else if (!isFlag && input.length() > 1) {
                x = Character.getNumericValue(input.charAt(0));
                y = Character.getNumericValue(input.charAt(1));
            } else {
                System.out.println("¡ERROR!. Ejemplo: b23");
                return;
            }

            if (x < 0 || x >= boxes || y < 0 || y >= boxes) {
                System.out.println("COORDENADAS ERRONEAS -> (0-7) <-");
                return;
            }

            if (isFlag) {
                flags[x][y] = !flags[x][y];
            } else {
                if (flags[x][y]) {
                    System.out.println("¡QUITA LA BANDERA PRIMERO!");
                    return;
                }
                revealSlot(x, y);
            }
        } catch (NumberFormatException e) {
            System.out.println("¡ERROR!. Ejemplo: b23");
        }
    }

    public static void revealSlot(int x, int y) {
        if (boardPlayer[x][y]) return;

        boardPlayer[x][y] = true;

        if (board[x][y] == 0) {
            gameOver = true;
            Resources.gameOverTitle();
            printBoard();
        }
    }

    public static void fillBoxes(){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != 0) {
                    int count = countMines(i, j);
                    board[i][j] = count == 0 ? -1 : count;
                }
            }
        }
    }

    private static int countMines(int x, int y) {
        int count = 0;
        for (int i = Math.max(0, x - 1); i <= Math.min(boxes - 1, x + 1); i++) {
            for (int j = Math.max(0, y - 1); j <= Math.min(boxes - 1, y + 1); j++) {
                if (board[i][j] == 0) count++;
            }
        }
        return count;
    }


    public static void boardGame(){
        Resources.headerBoard();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(j == 0){
                    System.out.print("| " + i + " | || ");
                    if(j == boxes - 1){
                        printSlots(i, j);
                        System.out.println();
                    } else {
                        printSlots(i, j);
                    }
                } else {
                    if(j == boxes - 1){
                        printSlots(i, j);
                        System.out.println();
                    } else {
                        printSlots(i, j);
                    }
                }
            }
        }
    }

    private static void printSlots(int x, int y) {
        if (flags[x][y]) {
            System.out.print("| F |");
        } else if (!boardPlayer[x][y]) {
            System.out.print("|   |");
        } else {
            if (board[x][y] == 0) {
                System.out.print("| * |");
            } else if (board[x][y] == -1) {
                System.out.print("| . |");
            } else {
                System.out.print("| " + board[x][y] + " |");
            }
        }
    }

    public static boolean winnerWinnerChickenDinner() {
        for (int i = 0; i < boxes; i++) {
            for (int j = 0; j < boxes; j++) {
                if (board[i][j] != 0 && !boardPlayer[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void printMines() {
        Resources.mineTitle();
        for (int i = 0; i < mines; i++) {
            System.out.println("Mina " + (i+1) + ": [" + ranMinesX[i] + "," + ranMinesY[i] + "]");
        }
        System.out.println();
    }

    public static void printBoard() {
        Resources.headerBoard();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(j == 0){
                    System.out.print("| " + i + " | || ");
                    if(j == boxes - 1){
                        printSlot(i, j);
                        System.out.println();
                    } else {
                        printSlot(i, j);
                    }
                } else {
                    if(j == boxes - 1){
                        printSlot(i, j);
                        System.out.println();
                    } else {
                        printSlot(i, j);
                    }
                }
            }
        }
    }

    private static void printSlot(int x, int y) {
        if (board[x][y] == 0) {
            System.out.print("| * |");
        } else if (board[x][y] == -1) {
            System.out.print("| · |");
        } else {
            System.out.print("| " + board[x][y] + " |");
        }
    }

}