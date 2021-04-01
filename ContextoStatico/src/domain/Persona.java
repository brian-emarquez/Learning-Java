/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author brian
 */
public class Persona {

    private int idPersona;
    private String nombre; // static: se asocia con la clase y no con lo objetos
    private static int contadorPersonas; // static: se asocia con la clase y no con lo objetos

    public Persona(String nombre) {
        this.nombre = nombre;

        Persona.contadorPersonas++;
//      contadorPersonas++;
//      asignar el nuevo valor de la variable idPersona

        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
}
