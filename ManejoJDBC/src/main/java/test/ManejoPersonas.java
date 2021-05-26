package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {
    
    public static void main(String[] args) { 
        
        PersonaJDBC personaJDBC = new PersonaJDBC();
        List<Persona> personas = personaJDBC.select();
        
        for(Persona persona: personas){
            System.out.println("persona:" + persona);
        }
        
        //Prueba insert
//        Persona persona = new Persona();
//        persona.setNombre("Maria");
//        persona.setApellido("Lara");
//        persona.setEmail("mlara@mail.com");
//        persona.setTelefono("55668899");

//        personaJDBC.insert(persona);
      
//        //Prueba update
//        Persona persona = new Persona();
//        persona.setId_persona(3);
//        persona.setNombre("Mayra");
//        persona.setApellido("Lara");
//        persona.setEmail("mlara@mail.com");
//        persona.setTelefono("55668899");
//        
//        personaJDBC.update(persona);

          Persona persona = new Persona();
          persona.setId_persona(3);
          
          personaJDBC.delete(persona);
    }
}
