/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_caja;

/**
 *
 * @author brian
 */
public class Proyecto_Caja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Proyecto caja
        int medidaAncho = 3;
        int medidaAlto = 2;
        int medidaProf = 6;
   
        Caja caja1 = new Caja();
        caja1.alto = medidaAlto;
        caja1.profundo = medidaProf;
        int resultado = caja1.calcularVolumen();
    
        System.out.println("resultado volumen de caja 1:" + resultado);

        Caja caja2 = new Caja(2, 4, 6);
        System.out.println("resultado volumen de caja 2:" + caja2.calcularVolumen());
    }
    
}
