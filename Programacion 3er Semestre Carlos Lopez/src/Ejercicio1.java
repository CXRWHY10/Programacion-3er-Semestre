import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Ejercicio1 {
    int[] vector_numeros= new int[10];

    public Ejercicio1() {

    }
    public void ejercutar() {
        for (int i= 0; i < vector_numeros.length; i++){
            int aleatorio = (int) (Math.random() * 10 + 1);
            vector_numeros[i] = aleatorio;
        }
        System.out.println("________________NUM___ALE____CUA____CUB");
        for (int i = 0; i < vector_numeros.length; i++){
            int numero= vector_numeros[1];
            int cuadrado = (int)Math.pow(numero, 2);
            int cubo = (int)Math.pow(numero,3);
            System.out.println("Vector Numeros | " + i + " | | " + numero + " | | " + cuadrado +" | | "+cubo+" | ");
        }
    }
}