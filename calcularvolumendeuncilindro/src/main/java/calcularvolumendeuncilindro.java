/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class calcularvolumendeuncilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float diametro = 6;
        float altura=10;
        double volumen;
        float PI=3.1416f;
        float radio = diametro/2;
        
        volumen=PI*Math.pow(radio, 2)*altura;
        System.err.println("el Resultado es: "+volumen);
   
    }
    
}
