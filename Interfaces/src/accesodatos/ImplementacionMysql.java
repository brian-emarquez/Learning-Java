/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesodatos;

// usamo implement cuando se va a usar las interfaces
public class ImplementacionMysql implements IAccesoDatos {

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");

    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Mysql");
    }
}
