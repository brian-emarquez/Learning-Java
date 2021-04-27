package domain;

/* Bloques de Inicialiacion:
- Estaticos
- No estatico
*/

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    /*Bloque Estatico*/
    static{
        System.out.println("Ejecuacion bloque estatico");
        ++Persona.contadorPersonas;

    }
     /* Bloque no estatico */
    {
        System.out.println("Ejecucion del bloque no estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    /*Contructor*/
    public Persona(){
        System.out.println("Ejecucion del contructor");
    }

    public int getIdPersona() {
        return idPersona;
    }  

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
