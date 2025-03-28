//implementar un programa que permita registrar a todos los estudiantes de la clase en un arreglo
//de tamaño 18. Luego ordenar el arreglo por edad y mostrando en pantalla
package Ejercicio4;

import java.util.Calendar;
import java.util.Date;

public class Persona {
    String nombre;
    String primerApellido;
    String segundoApelido;
    Date Nacimiento;
    Integer numeroCI;
    String complemento;
    public Persona(){

    }

     public Persona(String nombre, String primerApellido, String segundoApelido, Date Nacimiento, Integer numeroCI, String complemento){
         this.nombre = nombre;
         this.primerApellido = primerApellido;
         this.segundoApelido = segundoApelido;
         this.Nacimiento = Nacimiento;
         this.numeroCI = numeroCI;
         this.complemento = complemento;
     }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public Integer getNumeroCI() {
        return numeroCI;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setNumeroCI(Integer numeroCI) {
        this.numeroCI = numeroCI;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNombreCompleto() {
        return nombre + " " + primerApellido + " " + segundoApelido;
    }
}