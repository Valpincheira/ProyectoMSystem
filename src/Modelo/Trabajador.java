package Modelo;

/**
 * @author opazo-oses-pincheira-sanchez nov 2024
 */

public class Trabajador {
    private String id_trab;
    private String nom_trab;
    private String appat_trab;
    private String apmat_trab;
    private String tipo_trab;
    private String alias;
    private String contraseña;

    public Trabajador() {
    }

    public Trabajador(String id_trab, String nom_trab, String appat_trab, String apmat_trab, String tipo_trab, String alias, String contraseña) {
        this.id_trab = id_trab;
        this.nom_trab = nom_trab;
        this.appat_trab = appat_trab;
        this.apmat_trab = apmat_trab;
        this.tipo_trab = tipo_trab;
        this.alias = alias;
        this.contraseña = contraseña;
    }

    public String getId_trab() {
        return id_trab;
    }

    public void setId_trab(String id_trab) {
        this.id_trab = id_trab;
    }

    public String getNom_trab() {
        return nom_trab;
    }

    public void setNom_trab(String nom_trab) {
        this.nom_trab = nom_trab;
    }

    public String getAppat_trab() {
        return appat_trab;
    }

    public void setAppat_trab(String appat_trab) {
        this.appat_trab = appat_trab;
    }

    public String getApmat_trab() {
        return apmat_trab;
    }

    public void setApmat_trab(String apmat_trab) {
        this.apmat_trab = apmat_trab;
    }

    public String getTipo_trab() {
        return tipo_trab;
    }

    public void setTipo_trab(String tipo_trab) {
        this.tipo_trab = tipo_trab;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "id_trab=" + id_trab + ", nom_trab=" + nom_trab + ", appat_trab=" + appat_trab + ", apmat_trab=" + apmat_trab + ", tipo_trab=" + tipo_trab + ", alias=" + alias + ", contrase\u00f1a=" + contraseña + '}';
    }

    
    
}
