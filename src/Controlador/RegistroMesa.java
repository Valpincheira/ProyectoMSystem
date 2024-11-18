package Controlador;

import BD.ConexionBD;
import Modelo.Mesa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;
 
/**
 * @author opazo-oses-pincheira-sanchez nov 2024
 */
public class RegistroMesa {

  
        

    public boolean agregarMesa(Mesa mesa) {
        try {
            // Crear conexión a la base de datos
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            // Verificar si la mesa ya existe en la base de datos
            String checkQuery = "SELECT COUNT(*) FROM mesa WHERE nro_mesa = ?";
            PreparedStatement checkSt = cnx.prepareStatement(checkQuery);
            checkSt.setString(1, mesa.getNro_mesa());
            ResultSet rs = checkSt.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                // Si ya existe una mesa con ese número, mostramos un mensaje y retornamos false
                System.out.println("Error: La mesa con ese número ya existe.");
                rs.close();
                checkSt.close();
                cnx.close();
                return false;
            }

            // Si la mesa no existe, proceder a agregarla
            String query = "INSERT INTO mesa (nro_mesa, disp_mesa) VALUES (?, ?)";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setString(1, mesa.getNro_mesa());
            st.setBoolean(2, mesa.isDisponib_mesa());
            st.executeUpdate();

            // Cerrar conexiones
            st.close();
            cnx.close();

            System.out.println("Mesa agregada con éxito");
            return true;

        } catch (SQLException ex) {
            // Manejo de errores SQL
            System.out.println("Error en SQL al agregar mesa: " + ex.getLocalizedMessage());
            return false;
        } catch (Exception e) {
            // Manejo de otros errores
            System.out.println("Error en el método agregarMesa: " + e.getLocalizedMessage());
            return false;
        }

    }

    public List<Mesa> listarMesa() {
        List<Mesa> lista = new ArrayList<>();

        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            //query SQL
            String query = "SELECT * FROM mesa order by nro_mesa";
            PreparedStatement stmt = cnx.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Mesa mesa = new Mesa();
                mesa.setNro_mesa(rs.getString("numero mesa"));
                mesa.setDisponib_mesa(rs.getBoolean("disponibilidad de mesa"));

                lista.add(mesa);

            }
            rs.close();
            stmt.close();
            cnx.close();

        } catch (SQLException e) {
            System.out.println("Error en SQL al listar  mesa" + e.getLocalizedMessage());
        } catch (Exception e) {
            System.out.println("Error en el método listar mesa " + e.getLocalizedMessage());
        }
        return lista;
    }

    public boolean borrarMesa(String nro_mesa) {
        try {

            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            //query SQL
            String query = "DELETE FROM mesa WHERE nro_mesa = ?";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setString(1, nro_mesa);

            st.executeUpdate();
            st.close();
            cnx.close();

            return true;

        } catch (SQLException ex) {
            //Logger
            System.out.println("Error en SQL al eliminar mesa " + ex.getLocalizedMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error en el método eliminar mesa " + e.getLocalizedMessage());
            return false;
        }
    }
}
