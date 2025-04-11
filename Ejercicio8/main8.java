package Ejercicio8;

class main8 {
    public static void main(String[] args) {

        Resources.title();
        Resources.instructions();

        Buscaminas game = new Buscaminas();

        game.fillMines();
        game.fillBoard();
        game.fillBoardMines();
        game.fillBoxes();

        //game.printMines();
        //game.printBoard();



        while (!Buscaminas.gameOver) {
            game.boardGame();
            System.out.print("Ingresa tus coordenadas:");
            String input = game.sc.nextLine();
            System.out.println();
            game.play(input);

            if (game.winnerWinnerChickenDinner()) {
                Resources.winnerTitle();
                game.boardGame();
                break;
            }
        }



    }
}

class Resources {
    public static void title() {
        System.out.println("                        |  B U S C A  M I N A S |");
    }

    public static void headerBoard() {
        System.out.println("|             -->  T A B L E R O  <--           |");
        System.out.println("-------------------------------------------------");
        System.out.println("| --- || | 0 || 1 || 2 || 3 || 4 || 5 || 6 || 7 |");
        System.out.println("-------------------------------------------------");
    }
    public static void gameOverTitle() {
        System.out.println("  |  ¡    G A M E   O V E R   !   |");
        System.out.println("  |    ¡ L A  P R Ó X I M A !     |");
    }

    public static void winnerTitle() {
        System.out.println();
        System.out.println("       |  ¡ G A N A S T E ! |");
    }

    public static void mineTitle() {
        System.out.println();
        System.out.println("|  P O S I C I Ó N  D E  L A S  M I N A S  |");
    }

    public static void instructions() {
        System.out.println();
        System.out.println("|             I N S T R U C C I O N E S  D E  J U E G O                 |");
        System.out.println("| 1.- |  INGRESA UNA COORDENADA DE LA SIGUIENTE MANERA -> 24            |");
        System.out.println("| 2.- |  EN CASO DE PONER UNA BANDERA -> b24 || B24                     |");
        System.out.println("| 3.- |  EL JUEGO TERMINA SI ENCUENTRAS TODAS LAS BANDERAS, O EXPLOTAS! |");
    }
}