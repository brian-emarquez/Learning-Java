/*
Bajo Acoplamiento , separacion de codigo
tambien llamado Alta Coecion por que cada clace realiza su tarea
 */

 /* Metodos actualizar e eliminar"*/
package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();

//        List<Persona> persona = personaDao.Seleccionar();
//
//        persona.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });

          /*************** INSERTAR ****************/
          
//        Persona personaNueva = new Persona(2,"MariaI","EsperazaI","MariaI@mail.com");
//        personasDao.insertar(personaNueva);

         /*************** MODIFICAR ****************/
         
//        Persona personaModificar = new Persona(2, "brian", "marquez", "marquez@gmail.com");
//        personaDao.actualizar(personaModificar);

         /*************** ELIMINAR ****************/
        Persona personaEliminar = new Persona(2);
        personaDao.eliminar(personaEliminar);
                
        /*Listado de personas*/
        List<Persona> personas = personaDao.Seleccionar();

        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }

}
