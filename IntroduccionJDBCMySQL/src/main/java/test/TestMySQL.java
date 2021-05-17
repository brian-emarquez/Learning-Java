
package test;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;


public class TestMySQL {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT Nombre, Edad, Sexo FROM test";
            ResultSet resultado = instruccion.executeQuery(sql);
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }  
    }
}
