/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author brian
 */
public class Persona {
    //Atributos de la clase
    public String nombre; // no es buena pracrica poner el public en la variables
    public String apellido;
    
    //Metodos de la clase
    public void desplegarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
    }
}
