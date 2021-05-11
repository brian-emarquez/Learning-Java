package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMysql;

public class TestInterfaces {
    public static void main(String[] args) {
         IAccesoDatos datos = new ImplementacionMysql();
//         datos.listar();  
         mostar(datos);
    }
    public static void mostar(IAccesoDatos datos){
        datos.listar();
    }
}
