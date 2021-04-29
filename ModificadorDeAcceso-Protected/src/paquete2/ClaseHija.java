/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.Clase1;

/**
 *
 * @author brian
 */
public class ClaseHija extends Clase1{
    public ClaseHija(){
        super();
        this.atributoProtected = "Modificacion de atributo protected";
        this.metodoprotected();
    }
}
