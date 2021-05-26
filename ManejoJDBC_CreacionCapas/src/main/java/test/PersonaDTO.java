package test;

import datos.Conexion;
import datos.PersonaDaoJDBC;
import domain.Persona;
import java.sql.*;

public class PersonaDTO {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaDaoJDBC personaJdbc = new PersonaDaoJDBC(conexion);
            
            /* update se actualizara con exito*/
            Persona cambioPersona = new Persona();
            cambioPersona.setId_persona(1);
            cambioPersona.setNombre("Brian Enrique");
            cambioPersona.setApellido("Marquez");
            cambioPersona.setEmail("brian@mail.com");
            cambioPersona.setTelefono("11111111");
            personaJdbc.update(cambioPersona);
            
            /* En el insect ocurrira error */
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            nuevaPersona.setApellido("Ramirez");
            
            /* probocamos un fallo*/
//             nuevaPersona.setApellido("Ramirez1111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111222222222222222222222222");
             
            personaJdbc.insert(nuevaPersona);
            
            /*Commit de la trnasaccion*/
            conexion.commit();
            System.out.println("Se ha hecho commit de la transaccion");
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }

    }
}


