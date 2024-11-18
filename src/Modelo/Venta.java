
package Modelo;

import java.util.Date;


/**
 * @author opazo-oses-pincheira-sanchez nov 2024
 * 
 */ 

public class Venta {
    private int nro_venta;
    private String mesa, garzon,producto;
    private int valor;
 

    public Venta() {
    }

    public Venta(int nro_venta, String mesa, String garzon, String producto, int valor) {
        this.nro_venta = nro_venta;
        this.mesa = mesa;
        this.garzon = garzon;
        this.producto = producto;
        this.valor = valor;
    }

    public Venta(String producto, int valor) {
    }

    public int getNro_venta() {
        return nro_venta;
    }

    public void setNro_venta(int nro_venta) {
        this.nro_venta = nro_venta;
    }

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getGarzon() {
        return garzon;
    }

    public void setGarzon(String garzon) {
        this.garzon = garzon;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
       

}    