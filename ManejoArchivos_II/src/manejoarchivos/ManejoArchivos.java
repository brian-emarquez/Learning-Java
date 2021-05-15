package manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public static void escribirArchivo(String nombreArchivo, String contenido) {
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

    public static void anexaArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);

        /* generado automaticamente ayudandonos con netbeans*/
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            salida.print(contenido);
            salida.close();
            System.out.println("Se ha anexado en el archivo");

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        var archivo = new File(nombreArchivo);
        try {
            //BufferredReader nos ayuda a leer archivos
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }
}
