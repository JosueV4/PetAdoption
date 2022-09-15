
package beans;

import java.sql.Date;

public class Adopcion {
    private int idadopcion;
    private int idmascota;
    private String username;
    private Date fecha;
    private String genero;

    public Adopcion(int idadopcion, int idmascota, String username, Date fecha, String genero) {
        this.idadopcion = idadopcion;
        this.idmascota = idmascota;
        this.username = username;
        this.fecha = fecha;
        this.genero = genero;
    }

    public int getIdadopcion() {
        return idadopcion;
    }

    public void setIdadopcion(int idadopcion) {
        this.idadopcion = idadopcion;
    }

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Adopcion{" + "idadopcion=" + idadopcion + ", idmascota=" + idmascota + ", username=" + username + ", fecha=" + fecha + ", genero=" + genero + '}';
    }
    
}
