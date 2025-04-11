//implementar un programa que permita registrar a todos los estudiantes de la clase en un arreglo
//de tamaño 18. Luego ordenar el arreglo por edad y mostrando en pantalla
package Ejercicio4;
import java.util.*;
import java.text.*;
public class Persona {
    protected String nombre;
    protected String PrimerApellido;
    protected String SegundoApellido;
    protected Date Nacimiento;
    protected boolean complementoCi;
    protected String numeroCi;

    public Persona(String nombre, String PrimerApellido, String SegundoApellido, Date Nacimiento, boolean complementoCi, String numeroCi) {
        this.nombre = nombre;
        this.PrimerApellido = PrimerApellido;
        this.SegundoApellido = SegundoApellido;
        this.Nacimiento = Nacimiento;
        this.complementoCi = complementoCi;
        this.numeroCi = numeroCi;
    }

    public Persona() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return PrimerApellido;
    }

    public void setPrimerApellido(String PrimerApellido) {
        this.PrimerApellido = PrimerApellido;
    }

    public String getSegundoApellido() {
        return SegundoApellido;
    }

    public void setSegundoApellido(String SegundoApellido) {
        this.SegundoApellido = SegundoApellido;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public boolean getComplementoCi() {
        return complementoCi;
    }

    public void setComplementoCi(boolean complementoCi) {
        this.complementoCi = complementoCi;
    }

    public String getNumeroCi() {
        return numeroCi;
    }

    public void setNumeroCi(String numeroCi) {
        this.numeroCi = numeroCi;
    }
    public int calculateAge() {
        if (Nacimiento == null) {
            return 0;
        }
        Calendar today = Calendar.getInstance();
        Calendar birthCal = Calendar.getInstance();
        birthCal.setTime(Nacimiento);
        int age = today.get(Calendar.YEAR) - birthCal.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) < birthCal.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }
    public boolean hasComplemento() {
        return complementoCi;
    }
    public void addPerson(Scanner scanner) {
        System.out.println("INGRESE DATOS DE LA PERSONA ");

        System.out.print(" NOMBRE : ");
        this.nombre = scanner.nextLine();

        System.out.print(" PRIMER APELLIDO : ");
        this.PrimerApellido = scanner.nextLine();

        System.out.print(" SEGUNDO APELLIDO : ");
        this.SegundoApellido = scanner.nextLine();

        System.out.print(" FECHA DE NACIMIENTO (dd/MM/yyyy) : ");
        String dateStr = scanner.nextLine();

        try {
            this.Nacimiento = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
        } catch (ParseException e) {
            System.out.println("Incorrecto - Formato -> dd/MM/yyyy");
            this.Nacimiento = null;
        }

        System.out.print("¿TIENE COMPLEMENTO CI? (s/n): ");
        String complementStr = scanner.nextLine();
        this.complementoCi = complementStr.equalsIgnoreCase("s");

        System.out.print("Número de CI: ");
        this.numeroCi = scanner.nextLine();
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaNacStr = (Nacimiento != null) ? sdf.format(Nacimiento) : "SIN FECHA DE NACIMIENTO";
        return
                "\n| NOMBRE COMPLETO |: " + nombre + " " + PrimerApellido + " " + SegundoApellido +
                "\n| FECHA DE NACIMIENTO |: " + fechaNacStr +
                "\n| EDAD |: " + calculateAge() + " años" +
                "\n| CI |: " + numeroCi + (hasComplemento() ? " (TIENE COMPLEMENTO)" : "");
    }

}