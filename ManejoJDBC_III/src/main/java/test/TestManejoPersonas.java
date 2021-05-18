/*
Bajo Acoplamiento , separacion de codigo
tambien llamado Alta Coecion por que cada clace realiza su tarea
 */
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

/**
 *
 * @author brian
 */
public class TestManejoPersonas {
    
    public static void main(String[] args) {
        PersonaDAO personasDao= new PersonaDAO();
        List<Persona>personas = personasDao.Seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }
}
