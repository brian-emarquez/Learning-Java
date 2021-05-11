
package test;

import domain.Person;

public class EstJabaBeans {
    public static void main(String[] args) {
        Person persona = new Person();
        persona.setNombre("Brian");
        persona.setApellido("Marquez");
        
        System.out.println("persona nombre = " + persona.getNombre());
        System.out.println("persona apellido = " + persona.getApellido());
    }
}
