import java.util.Scanner;
public class Ejercicio2 {
    String[] original;
    String[] inverso;
    Scanner scanner;

    public Ejercicio2() {
        original = new String[5];
        inverso = new String[5];
        scanner = new Scanner(System.in);
    }

    public void ejercutar2() {
        for (int i = 0; i < original.length; i++) {
            System.out.println("Original | " + i + " | ");
            String cadena = scanner.nextLine();
            original[i] = cadena;
        }
        int indiceOriginal = 0;
        int indiceInverso = 4;
        while (indiceOriginal < original.length) {
            inverso[indiceInverso] = original[indiceOriginal];

            indiceOriginal++;
            indiceInverso--;

        }
        for (int i = 0; i < inverso.length; i++) {
            System.out.println("Inverso | "+ i + " | "+ inverso[i]);
        }
    }
}