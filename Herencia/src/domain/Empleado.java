/*Herencia*/

package domain;

// se agraga extends y se indica la clase padre
public class Empleado extends Persona{ 
    private int idEmpleado;
    private double sueldo;
    private static int contandorEmpleado;

    public Empleado(String nombre, double sueldo) {
        super(nombre); // manda a llamar a contructor de la clases de la clase persona
        this.idEmpleado = ++Empleado.contandorEmpleado; // variable estatica
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
       
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(); // string Builder
        sb.append("Empleado{idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", nombre=").append(this.nombre);
        sb.append('}');
        return sb.toString();
    }
   
}