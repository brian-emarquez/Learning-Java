package conexion;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Test {
    public static void main(String[] args) {
        
        try {
            Conexion _conexion = new Conexion();
            Connection _connection = null;
            
            _connection = _conexion.LinkConnection("jdbc:oracle:thin:@localhost:1521:XE", "briandb", "briandb");
            System.out.println("Connection "+ _connection);
            _connection = _conexion.closeConexion();       
            System.out.println("Connection "+ _connection.isClosed());
        } catch (SQLException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

