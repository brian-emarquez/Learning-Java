/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author brian
 */
public class Clase1 {
    protected String atributoProtected = "Valor Atributo protected";
    
    protected Clase1(){
        System.err.println("Constructor protegido");
    }
    
    public Clase1(String arg){
        System.out.println("Constructor publico ");
    }
    
 
    protected void metodoprotected(){
        System.out.println("Metodo Protected");
    }
}
