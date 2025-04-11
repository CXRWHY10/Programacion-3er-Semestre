package Ejercicio_9_10_11;

public class Ejercicio11 {
    int[][] diagonal;

    public Ejercicio11() {
        diagonal = new int[5][5];
    }

    public void ejecutar11() {
        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if(i == j){
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < diagonal.length; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                System.out.print(diagonal[i][j] + " ");
            }
            System.out.println();
        }

    }

}


