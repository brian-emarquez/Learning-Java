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
public class Persona { /* FINAL: se agrreegas final para restringir herencia*/
    public static int MI_Constante = 1;
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public final void imprimir(){
    System.out.println("Metodo imprimir");  
    }
}
