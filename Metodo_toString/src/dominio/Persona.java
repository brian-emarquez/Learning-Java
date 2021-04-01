/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author brian
 */
public class Persona {
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    // cosntructor
    public Persona(String nombre, double sueldo, boolean eliminado){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
          
    }
    
    public String getNombre(){
        return this.nombre;
    }    
    
    public void setNombre(String nombre){ // set modificar
        this.nombre = nombre;
    }
        
    public double getSueldo(){
        return this.sueldo;
    }    
    
    public void setSueldo(double sueldo){ // set modificar
        this.sueldo = sueldo;
    }
       
    public boolean isEliminado(){ //con los boolean no se usa get sino is
        return this.eliminado;
    }    
    
    public void setEliminado(boolean eliminado){ // set modificar
        this.eliminado = eliminado;
    }
    
    // toString: permite imprimir el estado de objeto
    public String toString(){
        return "persona [ nombre: " + this.nombre + 
                " ,  sueldo: " + this.sueldo + 
                " ,  eliminado: " + this.eliminado + "]";
    } 
}
