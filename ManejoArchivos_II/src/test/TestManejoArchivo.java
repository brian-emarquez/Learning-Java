/* Manejo de archovos*/

package test;

import static manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "Prueba.ext";
//        crearArchivo(nombreArchivo);
    anexaArchivo(nombreArchivo, "Hola desde java");
    anexaArchivo(nombreArchivo, "Adios desde java");
    }
}
