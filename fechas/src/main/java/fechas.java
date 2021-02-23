
import java.util.Calendar;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brian
 */
public class fechas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // fechas
        Calendar fechaNac=new GregorianCalendar(2000,01,01);
        Calendar fechaHoy = Calendar.getInstance();
        int anoNac = fechaNac.get(Calendar.YEAR);
        int anoHoy = fechaHoy.get(Calendar.YEAR);
        
        int edad = anoNac-anoHoy;
        System.err.println("Edad"+ edad);
        
    }
    
}
