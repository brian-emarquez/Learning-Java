package test;

import java.sql.*;

public class TestMySQL {

    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT Nombre, Edad, Sexo FROM test";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()) { // next : si tenemos un objeto aun por iterar . Veraddero o falso
                System.out.println("Persona = " + resultado.getInt("persona"));
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
