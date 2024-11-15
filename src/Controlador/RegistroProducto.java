
package Controlador;

import Modelo.Producto;
import java.sql.Connection;

/**
 *
 * @author valmi
 * version 14-11-2024
 */
public class RegistroProducto {
    
    public boolean agregarProducto(Producto producto){
        try {
            ConexionBD conexion = new ConexionBD;
            Connection cnx = conexion.obtenerConexion();  //Importar java.sql.connection
           
        } catch (Exception e) {
        }
    }
    
}
