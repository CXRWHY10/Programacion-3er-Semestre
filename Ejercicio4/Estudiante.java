package Ejercicio4;

import java.util.Calendar;
import java.util.Date;

public class Estudiante  extends Persona{
    public Estudiante(String nombre, String primerApellido, String segundoApelido, Date Nacimiento, Integer numeroCI, String complemento){
        super(nombre,primerApellido,segundoApelido,Nacimiento,numeroCI,complemento);
    }
    public Integer calcularEdad (Date Nacimiento){
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(Nacimiento);
        Calendar hoy = Calendar.getInstance();
        int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);
        if (hoy.get(Calendar.MONTH) < nacimiento.get(Calendar.MONTH) || (hoy.get(Calendar.MONTH) == nacimiento.get(Calendar.MONTH) && hoy.get(Calendar.DAY_OF_MONTH) < nacimiento.get(Calendar.DAY_OF_MONTH))){
            edad--;
        }
        return edad;
    }
}
