import java.util.Scanner;

public class Ejercicio3 {
    int[] notas;
    Scanner  scanner;
    public Ejercicio3(){
        notas = new int[5];
        scanner = new Scanner(System.in);
    }
    public void ejecutar3(){
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas | " + i + " | ");
            int nota = scanner.nextInt();
            notas[i] = nota;
        }
        int suma = 0;
        double promedio;

        int minimo = 10;
        int maximo = 100;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Notas | "+ i + " | " + notas[i]);
            suma = suma + notas[i];

            if (notas[i] < minimo){
                minimo = notas[i];
            }
            if (notas[i] > maximo){
                maximo = notas[i];
            }
        }
        promedio = suma / notas.length;
        System.out.println("Promedio -->" + promedio);
        System.out.println("Maximo -->" + maximo);
        System.out.println("Minimo -->" + minimo);
    }
}
