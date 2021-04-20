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
public class Empleado extends Persona{ /* Final: No podemos heredar de la clase padre*/
    
    @Override /*decimos que el metoso esta en la clase padre*/
    public void imprimir(){
        System.out.println("Metodo imprimir desde clase hija");  
    }
}