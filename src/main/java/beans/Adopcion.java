/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.sql.Date;

/**
 *
 * @author ingyo
 */
public class Adopcion {

    private int id;
    private String username;
    private Date fecha;
    private String genero;
    private String especie;

    
    
    public Adopcion(int id, String username, Date fecha, String genero, String especie) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
        this.genero = genero;
        this.especie = especie;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Adopcion{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + ", genero=" + genero + ", especie=" + especie + '}';
    }
    
    
    
}
