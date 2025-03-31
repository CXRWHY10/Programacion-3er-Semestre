import java.util.Scanner;

public class Ejercicio7 {
    int[] vector1;
    int[] vector2;
    int[] vector3;
    Scanner scanner;
    public Ejercicio7(){
        vector1 = new int[5];
        vector2 = new int[5];
        vector3 = new int[5];
        scanner = new Scanner(System.in);
    }
    public void ejecutar(){
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("vector 1 ==> "+i+" <== ");
            int numero1 = scanner.nextInt();
            vector1[i] = numero1;

            System.out.println("vector 2 ==> "+i+" <== ");
            int numero2 = scanner.nextInt();

            vector3[i] = vector1[i] + vector2[i];
            System.out.println("vector 3 ==> "+i+" <== ");
        }
    }
}
