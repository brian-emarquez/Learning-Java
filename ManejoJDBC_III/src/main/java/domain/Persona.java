/* Se agregaron cnstructores, get an set*/
/* DAO  - Data Access Object */
package domain;

public class Persona {
    private int id_Persona;
    private String nombre;
    private String apellido;
    private String email;

    public Persona() {
        
    }

    public Persona(int id_Persona) {
        this.id_Persona = id_Persona;
    }

    public Persona(String nombre, String apellido, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public Persona(int id_Persona, String nombre, String apellido, String email) {
        this.id_Persona = id_Persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
    }

    public int getId_Persona() {
        return id_Persona;
    }

    public void setId_Persona(int id_Persona) {
        this.id_Persona = id_Persona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona{" + "id_Persona=" + id_Persona + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + '}';
    }

}
