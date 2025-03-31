import java.util.Scanner;

class Mes{
    private int numero;
    private String nombre;
    private int cantidadDias;
    public Mes (int numero,String nombre,int cantidadDias){
        this.setNumero(numero);
        this.setNombre(nombre);
        this.setCantidadDias(cantidadDias);
    }

    public String toString(){
        return "Mes: "+nombre+"Cantidas de dias: "+cantidadDias;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }
}
public class Ejercicio6 {
    Mes[] meses = new Mes[12];
    Scanner scanner;
    public Ejercicio6(){
        meses [0] = new Mes(1,"Enero",31);
        meses [0] = new Mes(2,"Febrero",28);
        meses [0] = new Mes(3,"Marzo",31);
        meses [0] = new Mes(4,"Abril",30);
        meses [0] = new Mes(5,"Mayo",31);
        meses [0] = new Mes(6,"Junio",30);
        meses [0] = new Mes(7,"Julio",31);
        meses [0] = new Mes(8,"Agosto",31);
        meses [0] = new Mes(9,"Septiembre",30);
        meses [0] = new Mes(10,"Octubre",31);
        meses [0] = new Mes(11,"Noviembre",30);
        meses [0] = new Mes(12,"Diciembre",31);

        scanner = new Scanner(System.in);
    }
    public void ejecutar(){
        System.out.println("Introduzca el numero del mes");
        int numero = scanner.nextInt();
        Mes mes = meses[numero - 1];
        System.out.println(mes);
    }
}
