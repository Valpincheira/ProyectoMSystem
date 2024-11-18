package BD;

import java.sql.Connection;
import java.sql.DriverManager;

  
/**
 *
 * @author opazo-oses-pincheira-sanchez nov 2024
 */
public class ConexionBD {
    
    public Connection obtenerConexion(){
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/msystem", "root", "Leonchito123.");
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println("error de conexion");
        }
        
        return conexion;
    }
    
}
