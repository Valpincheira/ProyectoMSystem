package BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author valmi
 * version 14-11-2024
 */
public class ConexionBD {
    
    public Connection obtenerConexion(){
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/valeska", "root", "Leonchito123.");
        } catch (Exception e) {
        }
        
    return conexion;
    }
    
}
