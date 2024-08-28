package org.example;

import java.io.File;
import java.util.Scanner;

public class RenameFolder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la ruta actual de la carpeta
        // C:\Users\brian\Downloads\demo
        System.out.print("Ingrese la ruta actual de la carpeta: ");
        String oldFolderPath = scanner.nextLine();
        File oldFolder = new File(oldFolderPath);

        // Solicitar al usuario el nuevo nombre de la carpeta
        System.out.print("Ingrese el nuevo nombre de la carpeta: ");
        String newFolderName = scanner.nextLine();

        // Crear la nueva ruta con el nuevo nombre
        File newFolder = new File(oldFolder.getParent(), newFolderName);

        // Renombrar la carpeta
        if (oldFolder.renameTo(newFolder)) {
            System.out.println("Carpeta renombrada exitosamente");
        } else {
            System.out.println("Error al renombrar la carpeta");
        }

        scanner.close();
    }
}
