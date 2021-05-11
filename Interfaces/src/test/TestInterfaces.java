package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMysql;

public class TestInterfaces {
    public static void main(String[] args) {
         IAccesoDatos datos = new ImplementacionMysql();
         datos.listar();
         
    }
}
