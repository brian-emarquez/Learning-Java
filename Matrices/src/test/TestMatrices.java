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
public class TestMatrices {
    public static void main(String[] args) {
        int edades [][] = new int [3][2];
        System.out.println("edades = " + edades);
        
        edades [0][0] = 5;
        edades [0][1] = 7;
        edades [1][0] = 8;
        edades [1][1] = 3;
        
        System.out.println("edades 0 - 0 = " + edades[0][0]);
    }
}
