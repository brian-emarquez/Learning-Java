package test;

import java.sql.*;

public class TestMysqlJDBC {

    public static void main(String[] args) {
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, "root", "");
            Statement instruccion = conexion.createStatement();
            var sql = "SELECT id_persona, nombre, apellido, email FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while (resultado.next()) { // next : si tenemos un objeto aun por iterar . Veraddero o falso
                System.out.print("id_persona = " + resultado.getInt("id_persona"));
                System.out.print(" Nombre = " + resultado.getString("nombre"));
                System.out.print(" Apellido = " + resultado.getString("apellido"));

                System.out.print(" | ");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
