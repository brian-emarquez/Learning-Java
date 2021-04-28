/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author brian
 */
public class TextForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,8,9};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
    }
}
