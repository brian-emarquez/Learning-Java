package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaJDBC personaJdbc = new PersonaJDBC(conexion);
            
            Persona cambioPersona = new Persona();
            cambioPersona.setId_persona(2);
            cambioPersona.setNombre("Karla Ivonne");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("kgomez@mail.com");
            cambioPersona.setTelefono("7713445678");
            personaJdbc.update(cambioPersona);
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            //nuevaPersona.setApellido("Ramirez11111111111111111111111111111111111111111111");
            nuevaPersona.setApellido("Ramirez");
            personaJdbc.insert(nuevaPersona);
            
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
