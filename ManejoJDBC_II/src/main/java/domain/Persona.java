
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
    
    
    
}
