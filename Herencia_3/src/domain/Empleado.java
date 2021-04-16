/*Herencia*/

package domain;

// se agraga extends y se indica la clase padre
public class Empleado extends Persona{ 
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado; /*Utiliamos statis para hace incrementos*/

    public Empleado(String nombre, double sueldo) {
        super(nombre); /* llamada al la clase padre de manera interna*/
        this.idEmpleado = ++Empleado.contadorEmpleado; /* Variable estatica*/
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldo=").append(sueldo);
        sb.append('}');
        return sb.toString();
    }
    
     
    
    
}