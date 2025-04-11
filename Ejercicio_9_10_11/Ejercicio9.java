package Ejercicio_9_10_11;

import java.util.Scanner;

public class Ejercicio9 {
    Dia [] dias;
    Scanner scanner;

    public Ejercicio9() {
        dias = new Dia[5];
        scanner = new Scanner(System.in);
    }
    public void ejecutar9() {

        for (int i = 0; i < dias.length; i++) {
            System.out.println("Temperatura minima dias ["+i+"]");
            double minima = scanner.nextDouble();
            System.out.println("Temperatura maxima dias ["+i+"]");
            double maxima = scanner.nextDouble();
            double media = (minima + maxima) / 2.0;
            Dia dia = new Dia(minima, maxima, media);
            dias[i] = dia;
        }

        System.out.println("\n Temperaturas medias");
        for (int i = 0; i < dias.length; i++) {
            System.out.println("Temperatura media dias ["+i+"]"+dias[i].getTemperaturaMedia());
        }
        // Ordenamos en busca de las minimas
        for (int i = 0; i < dias.length - 1; i++) {
            for (int j = 0; j < dias.length - 1 - i; j++) {
                if (dias[j].getTemperaturaMinima() > dias[j+1].getTemperaturaMinima()) {
                    Dia aux = dias[j];
                    dias[j] = dias[j+1];
                    dias[j+1] = aux;
                }
            }
        }
        System.out.println("\n Temperaturas minimas");
        for (int i = 0; i < 2; i++) {
            System.out.println("Temperatura minima dias ["+i+"]"+dias[i].getTemperaturaMinima());
        }
        System.out.println("\n Introduzca una temperatura Maxima: ");
        double temperatura = scanner.nextDouble();
        int contador=0;
        for (int i = 0; i < dias.length; i++) {
            if (dias[i].getTemperaturaMaxima() == temperatura) {
                System.out.println(dias [i]);
                contador++;
            }
        }
        if (contador == 0) {
            System.out.println("No se encontraron dias que coincidan con la temperatura ingresada");
        };
    }
}