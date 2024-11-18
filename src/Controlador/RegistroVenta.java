package Controlador;

import BD.ConexionBD;
import Modelo.Venta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author opazo-oses-pincheira-sanchez nov 2024
 * 
 */
public class RegistroVenta {


    public boolean agregarVenta(Venta venta) {
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            String query = "INSERT INTO venta(mesa,garzon,producto,valor) VALUES (?,?,?,?)";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setString(1, venta.getMesa());
            st.setString(2, venta.getGarzon());
            st.setString(3, venta.getProducto());
            st.setInt(4, venta.getValor());

                    
                    
            st.executeUpdate();
            st.close();
            cnx.close();
            JOptionPane.showMessageDialog(null, "Venta guardada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
            return true;

        } catch (SQLException ex) {
            //logger
            System.out.println("Error en SQL al agregar venta " + ex.getLocalizedMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error en el metodo al agregar venta " + e.getLocalizedMessage());
            return false;
        }
    }

    public boolean eliminarVenta(int nro_venta) {
                
        try {
           ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            //query SQL
            String query = "DELETE FROM venta WHERE nro_venta = ? ";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setInt(1, nro_venta);

            st.executeUpdate();
            st.close();
            cnx.close();
            return true;
             
        } catch (SQLException ex) {
            //logger
            System.out.println("Error SQL al eliminar venta " + ex.getLocalizedMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el metodo eliminar venta " +e.getLocalizedMessage());
            return false;
        }
    }

    public boolean actualizarVenta(Venta venta) {
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            //query SQL

            String query = "UPDATE Venta SET mesa = ?,garzon = ?,producto = ?, valor = ?  WHERE nro_venta = ?";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setString(1, venta.getMesa());
            st.setString(2, venta.getGarzon());
            st.setString(3, venta.getProducto());
            st.setInt(4, venta.getValor());

            st.executeUpdate();
            st.close();
            cnx.close();

            return true;

        } 
        catch (SQLException ex) {
            //logger
            System.out.println("Error en SQL al actualizar venta " + ex.getLocalizedMessage());
            return false;
        } 
        catch (Exception e) {
            System.out.println("Error en el metodo actualizar venta " + e.getLocalizedMessage());
            return false;
        }
    }
    public boolean buscarPorNro_Venta(int nro_venta) throws SQLException{
        
        Venta venta = new Venta();
        
        try {

            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            //query SQL
            String query = "SELECT * FROM venta  where nro_venta = ?";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setInt(1, nro_venta);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                venta.setProducto(rs.getString("producto"));

            }
            
        rs.close();
        st.close();
        cnx.close();

        }
        catch (SQLException e) {
            System.out.println("Error en SQL al buscar venta " + e.getLocalizedMessage());
            return false;
        }
        catch (Exception ex) {
            System.out.println("Error en el metodo buscar venta " + ex.getLocalizedMessage());
            return false;
        }
        return false;
     
    }
}

 