package conexion;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    Connection _connection = null;

    public Connection LinkConnection(String jdbc, String user, String password) {
        try {
            _connection = DriverManager.getConnection(jdbc, user, password);
            System.out.println("Conecction Successfull" + _connection.isClosed());
            return _connection;
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
            return null;
        }
    }

    public Connection closeConexion() {
        try {
            this._connection.close();
            return this._connection;
        } catch (SQLException sqlex) {
           sqlex.printStackTrace();
            return null;
        }
    }
}
