package manejoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ManejoArchivos {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        /* generado automaticamente ayudandonos con netbeans*/
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se ha creado el archivo ");
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    public static void escribirArchivo (String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo);

        /* generado automaticamente ayudandonos con netbeans*/
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.print(contenido);
            salida.close();
            System.out.println("Se ha escrito en el archivo");
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
        
    }   
}
