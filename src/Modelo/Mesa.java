package Modelo;

/**
 * @author opazo-oses-pincheira-sanchez nov 2024
 */

public class Mesa {
    
    private String nro_mesa;
    private boolean disponib_mesa;

    public Mesa() {
    }

    public Mesa(String nro_mesa, boolean disponib_mesa) {
        this.nro_mesa = nro_mesa;
        this.disponib_mesa = disponib_mesa;
    }

    public String getNro_mesa() {
        return nro_mesa;
    }

    public void setNro_mesa(String nro_mesa) {
        this.nro_mesa = nro_mesa;
    }

    public boolean isDisponib_mesa() {
        return disponib_mesa;
    }

    public void setDisponib_mesa(boolean disponib_mesa) {
        this.disponib_mesa = disponib_mesa;
    }

    @Override
    public String toString() {
        return "Mesa{" + "nro_mesa=" + nro_mesa + ", disponib_mesa=" + disponib_mesa + '}';
    }
    
}
