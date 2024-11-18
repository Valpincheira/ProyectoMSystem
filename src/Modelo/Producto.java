package Modelo;

/**
 * @author opazo-oses-pincheira-sanchez nov 2024
 */

public class Producto {
    private String id_prod;
    private String nombre_prod;
    private int precio_prod;

    public Producto() {
    }

    public Producto(String id_prod, String nombre_prod, int precio_prod) {
        this.id_prod = id_prod;
        this.nombre_prod = nombre_prod;
        this.precio_prod = precio_prod;
    }

    public String getId_prod() {
        return id_prod;
    }

    public void setId_prod(String id_prod) {
        this.id_prod = id_prod;
    }

    public String getNombre_prod() {
        return nombre_prod;
    }

    public void setNombre_prod(String nombre_prod) {
        this.nombre_prod = nombre_prod;
    }

    public int getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(int precio_prod) {
        this.precio_prod = precio_prod;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_prod=" + id_prod + ", nombre_prod=" + nombre_prod + ", precio_prod=" + precio_prod + '}';
    }

    

   

    
}