package Controlador;

import BD.ConexionBD;
import Modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


/**
 * @author opazo-oses-pincheira-sanchez nov 2024
 */
public class RegistroProducto {

    public boolean agregarProducto(Producto producto) {
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();  //Importar java.sql.connection
            
            String query = "INSERT INTO producto(id_prod, nombre_prod,precio_prod) VALUES(?,?,?)";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setString(1, producto.getId_prod());
            st.setString(2, producto.getNombre_prod());
            st.setInt(3, producto.getPrecio_prod());
            
             
            
            st.executeUpdate();
            st.close();
            cnx.close();
            
            return true;

        } catch (SQLException ex) {
            //log
            System.out.println("Error en SQL al agregar el producto" + ex.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error en el metodo agregar producto" + e.getMessage());
            return false;
        }
    }

    public boolean eliminarProducto(String id_prod) {
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            String query = "DELETE FROM producto WHERE id_prod = ?";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setString(1, id_prod);
            
            st.executeUpdate();
            st.close();
            cnx.close();
            
            return true;

        } catch (SQLException ex) {
            System.out.println("Error en SQL eliminar producto" + ex.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error  en el metodo eliminar producto" + e.getMessage());
            return false;

        }
    }

    public boolean actualizarProducto(Producto prod) {
            
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            String query = "UPDATE producto SET nombre_prod = ?, precio_prod = ? WHERE id_prod = ?";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setString(1, prod.getNombre_prod());
            st.setInt(2, prod.getPrecio_prod());
            st.setString(3, prod.getId_prod());

            st.executeUpdate();
            st.close();
            cnx.close();

            return true;
             
        } catch (SQLException ex) {
            System.out.println("Error en SQL al actualizar el producto" + ex.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error en el metodo actualizaar el producto" + e.getMessage());
            return false;

        }

    }

    public Producto buscarPorId(String id_prod) {
        Producto producto = null;
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            String query = "SELECT * FROM producto WHERE id_prod = ?";
            
            PreparedStatement st = cnx.prepareStatement(query);
            st.setString(1, id_prod);
            
            ResultSet rs = st.executeQuery();
            
            if (rs.next()) {
                producto = new Producto();
                producto.setId_prod(rs.getString("id_prod"));
                producto.setNombre_prod(rs.getString("nombre_prod"));
                producto.setPrecio_prod(rs.getInt("precio_prod"));
                
            }
            
            rs.close();
            st.close();
            cnx.close();
            
        } catch (SQLException ex) {
            System.out.println("Error en SQL al listar producto por ID" + ex.getMessage());
         
        } catch (Exception e) {
            System.out.println("Error  en el metodo listar producto por ID" + e.getMessage());
        }
        return producto;
    }
    
    
    public List<Producto> listarProducto() {
        List<Producto> listaProducto = new ArrayList<>();
//    List<Producto> productosFiltrados = new ArrayList<>();
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            // Consulta SQL para obtener todos los productos
            String query = "SELECT * FROM producto";
            PreparedStatement st = cnx.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            // Iteramos sobre el resultado de la consulta
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setId_prod(rs.getString("id_prod"));
                producto.setNombre_prod(rs.getString("nombre_prod"));
                producto.setPrecio_prod(rs.getInt("precio_prod"));

                System.out.println("Producto agregado con éxito" + producto.getId_prod() + " , " + producto.getNombre_prod());

                // Agregamos todos los productos a la lista
                listaProducto.add(producto);

            }

            // Cerramos la conexión y los recursos
            rs.close();
            st.close();
            cnx.close();

        } catch (SQLException ex) {
            System.out.println("Error en SQL al listar productos: " + ex.getMessage());
        } catch (Exception e) {
            System.out.println("Error en el método listar productos: " + e.getMessage());
        }

        // Aquí puedes devolver tanto la lista completa de productos como los filtrados
        return listaProducto; // O si prefieres devolver todos los productos, usa listaProducto
    }

    
    
    
}
