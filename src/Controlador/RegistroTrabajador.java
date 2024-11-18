package Controlador;

import BD.ConexionBD;
import Modelo.Producto;
import Modelo.Trabajador;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author opazo-oses-pincheira-sanchez nov 2024
 */
public class RegistroTrabajador {

    public static String cifrarContraseña(String contraseña) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(contraseña.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hash) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();  // Devuelve la contraseña cifrada
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean agregaTrabajador(Trabajador tab) {
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();  //Importar java.sql.connection

            String query = "INSERT INTO trabajador (id_trab,nombre_trab,appat_trab,apmat_trab,tipo_trab,alias,contraseña) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setString(1, tab.getId_trab());
            st.setString(2, tab.getNom_trab());
            st.setString(3, tab.getAppat_trab());
            st.setString(4, tab.getApmat_trab());
            st.setString(5, tab.getTipo_trab());
            st.setString(6, tab.getAlias());

            //cifrado de contraseña
            String contraseñaCifrada = cifrarContraseña(tab.getContraseña());
            st.setString(7, contraseñaCifrada); //alamcenamos la contraseña

            st.executeUpdate();
            st.close();
            cnx.close();
            return true;

        } catch (SQLException ex) {
            //log
            System.out.println("Error en SQL al agregar al trabajador" + ex.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error en el metodo agregar el trabajador" + e.getMessage());
            return false;
        }
    }

    public boolean eliminarTrabajador(String id_trab) {
        
            try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            String query = "DELETE FROM trabajador WHERE id_trab = ?";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setString(1, id_trab);
            
            st.executeUpdate();
            st.close();
            cnx.close();
            
            return true;

        } catch (SQLException ex) {
            System.out.println("Error en SQL eliminar trabajador" + ex.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error  en el metodo eliminar trabajador" + e.getMessage());
            return false;

        }
        
    }
//        try {
//            ConexionBD conexion = new ConexionBD();
//            Connection cnx = conexion.obtenerConexion();
//
//            String query = "DELETE FROM producto WHERE id_trab = ?";
//            PreparedStatement st = cnx.prepareStatement(query);
//            st.setString(1, id_trab);
//            st.executeUpdate();
//            st.close();
//            cnx.close();
//            return true;
//
//        } catch (SQLException ex) {
//            System.out.println("Error en SQL eliminar trabajador" + ex.getMessage());
//            return false;
//        } catch (Exception e) {
//            System.out.println("Error  en el metodo eliminar trabajador" + e.getMessage());
//            return false;
//
//        }
//    }

    public boolean actualizarTrabajador(Trabajador trab) {
        try {
            // Establecer la conexión a la base de datos
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            // Consulta SQL para actualizar el nombre del trabajador según su ID
            String query = "UPDATE trabajador SET nombre_trab = ? WHERE id_trab = ?";

            // Preparar la sentencia SQL
            PreparedStatement st = cnx.prepareStatement(query);

            // Establecer los valores de los parámetros en la consulta
            st.setString(1, trab.getNom_trab()); // Nuevo nombre
            st.setString(2, trab.getId_trab());  // ID del trabajador que se desea actualizar

            // Ejecutar la actualización
            int rowsAffected = st.executeUpdate();

            // Verificar si se actualizó algún registro
            if (rowsAffected > 0) {
                st.close();
                cnx.close();
                return true; // Si se actualizó al menos un trabajador, se devuelve true
            } else {
                st.close();
                cnx.close();
                return false; // Si no se actualizó ningún registro, se devuelve false
            }
        } catch (SQLException ex) {
            System.out.println("Error en SQL al actualizar al trabajador: " + ex.getMessage());
            return false; // En caso de error SQL, se devuelve false
        } catch (Exception e) {
            System.out.println("Error al actualizar el trabajador: " + e.getMessage());
            return false; // En caso de cualquier otro error, se devuelve false
        }
    }

    public Trabajador buscarPorId(String id_trab) {
        Trabajador trabajador = new Trabajador();
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            String query = "SELECT * FROM trabajador WHERE id_trab=?";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setString(1, id_trab);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                trabajador.setId_trab(rs.getString("id_trab"));
                trabajador.setNom_trab(rs.getString("nombre_trab"));
                trabajador.setAppat_trab(rs.getString("appat_trab"));
                trabajador.setApmat_trab(rs.getString("apmat_trab"));
                trabajador.setTipo_trab(rs.getString("tipo_trab"));
                trabajador.setAlias(rs.getString("alias"));
                trabajador.setContraseña(rs.getString("contraseña"));
            }

            rs.close();
            st.close();
            cnx.close();

        } catch (SQLException ex) {
            System.out.println("Error en SQL al buscar trabajador por ID: " + ex.getMessage());

        } catch (Exception e) {
            System.out.println("Error en el método buscar trabajador por ID: " + e.getMessage());
        }

        return trabajador;
    }

    public List<Trabajador> listarTrabajador() {
        List<Trabajador> listaTrabajador = new ArrayList<>();
        List<Trabajador> garzones = new ArrayList<>();
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();

            String query = "SELECT * FROM trabajador";
            PreparedStatement st = cnx.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Trabajador trabajador = new Trabajador();
                trabajador.setId_trab(rs.getString("id_trab"));
                trabajador.setNom_trab(rs.getString("nombre_trab"));
                trabajador.setAppat_trab(rs.getString("appat_trab"));
                trabajador.setApmat_trab(rs.getString("apmat_trab"));
                trabajador.setTipo_trab(rs.getString("tipo_trab"));
                trabajador.setAlias(rs.getString("alias"));
                trabajador.setContraseña(rs.getString("contraseña"));

                listaTrabajador.add(trabajador); // Agrega todos los trabajadores a la lista

                // Filtrar solo los garzones
                if ("Garzon".equals(trabajador.getTipo_trab())) {
                    garzones.add(trabajador); // Solo agregamos los de tipo "Garzon"
                }
            }

            rs.close();
            st.close();
            cnx.close();

        } catch (SQLException ex) {
            System.out.println("Error en SQL al listar trabajadores: " + ex.getMessage());
        } catch (Exception e) {
            System.out.println("Error en el método listar trabajadores: " + e.getMessage());
        }
 
        // Aquí puedes devolver tanto la lista completa de trabajadores como los garzones
        // Si solo necesitas los garzones, puedes devolver la lista garzones
        return garzones; // O si prefieres devolver todos los trabajadores, usa listaTrabajador
    }

    public Trabajador verificarCredenciales(String alias, String contraseña) {

        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
 
            // Consulta SQL para buscar el alias y la contraseña
            String query = "SELECT * FROM trabajador WHERE alias = ? AND contraseña = ?";
            PreparedStatement st = cnx.prepareStatement(query);
            st.setString(1, alias);
            st.setString(2, contraseña);

            ResultSet rs = st.executeQuery();

            // Si se encuentra el trabajador, se crea y devuelve el objeto Trabajador
            if (rs.next()) {
                Trabajador trabajador = new Trabajador();
                trabajador.setId_trab(rs.getString("id_trab"));
                trabajador.setNom_trab(rs.getString("nombre_trab"));
                trabajador.setAppat_trab(rs.getString("appat_trab"));
                trabajador.setApmat_trab(rs.getString("apmat_trab"));
                trabajador.setTipo_trab(rs.getString("tipo_trab"));
                trabajador.setAlias(rs.getString("alias"));
                trabajador.setContraseña(rs.getString("contraseña"));
                return trabajador; // Credenciales válidas
            }

            rs.close();
            st.close();
            cnx.close();

        } catch (SQLException ex) {
            System.out.println("Error en SQL al verificar credenciales: " + ex.getMessage());
        }
        return null; // Credenciales inválidas
    }
}
