/*package Ejercicio4;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Registro {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Estudiante[] estudiantes = new Estudiante[18];

        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingrese el nombre del estudiante"+(i + 1)+" ==> ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el Apellido Paterno del estudiante"+(i + 1)+" ==> ");
            String primerApellido = sc.nextLine();
            System.out.println("Ingrese el Apellido Materno del estudiante"+(i + 1)+" ==> ");
            String segundoApellido = sc.nextLine();
            System.out.println("Ingrese la fecha de nacimiento del estudiante"+(i + 1)+" ==> ");
            String fechaStr = sc.nextLine();
            Date Nacimiento = null;
            System.out.println("Ingrese el numero CI del estudiante"+(i + 1)+" ==> ");
            Integer numeroCI = sc.nextInt();
            System.out.println("Ingrese el Complemento del CI si tiene el estudiante"+(i + 1)+" ==> ");
            String complemento = sc.nextLine();
            estudiantes[i] = new Estudiante(nombre,primerApellido,segundoApellido,Nacimiento,numeroCI,complemento);

            Arrays.sort(estudiantes, Comparator.comparingInt(Estudiante -> estudiantes.calcularEdad()));
            System.out.println("Estudiantes ordenados por edad");

            for (Estudiante estudiante : estudiantes){
                if (estudiante != null){
                    System.out.println("Nombre Completo: "
                    + estudiante.getNombreCompleto()+ "Edad: " + estudiantes.calcularEdad()+", CI: " +estudiante.getNumeroCI());
                }
            }
        }
    }
}
*/