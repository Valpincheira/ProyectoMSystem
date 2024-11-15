
package Modelo;

/**
 *
 * @author valmi
 * version 13-11-2024
 */
public class Producto {
    private String id_prod;
    private String nom_prod;
    private int precio_prod;

    public Producto() {
    }

    public Producto(String id_prod, String nom_prod, int precio_prod) {
        this.id_prod = id_prod;
        this.nom_prod = nom_prod;
        this.precio_prod = precio_prod;
    }

    public String getId_prod() {
        return id_prod;
    }

    public void setId_prod(String id_prod) {
        this.id_prod = id_prod;
    }

    public String getNom_prod() {
        return nom_prod;
    }

    public void setNom_prod(String nom_prod) {
        this.nom_prod = nom_prod;
    }

    public int getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(int precio_prod) {
        this.precio_prod = precio_prod;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_prod=" + id_prod + ", nom_prod=" + nom_prod + ", precio_prod=" + precio_prod + '}';
    }
    
    
    
}
