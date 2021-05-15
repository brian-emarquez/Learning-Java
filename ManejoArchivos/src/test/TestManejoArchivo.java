/* Manejo de archovos*/

package test;

import static manejoarchivos.ManejoArchivos.crearArchivo;

public class TestManejoArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "Prueba.ext";
        crearArchivo(nombreArchivo);
    }
}
