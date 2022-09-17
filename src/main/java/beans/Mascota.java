/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author ingyo
 */
public class Mascota {

    private int id;
    private String nombremascota;
    private String genero;
    private String especie;
    private String ubicacion;
    private String raza;
    private int edad;
    private boolean disponible;

    
    
    public Mascota(int id, String nombremascota, String genero, String especie, String ubicacion, String raza, int edad, boolean disponible) {
        this.id = id;
        this.nombremascota = nombremascota;
        this.genero = genero;
        this.especie = especie;
        this.ubicacion = ubicacion;
        this.raza = raza;
        this.edad = edad;
        this.disponible = disponible;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombremascota() {
        return nombremascota;
    }

    public void setNombremascota(String nombremascota) {
        this.nombremascota = nombremascota;
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

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Mascota{" + "id=" + id + ", nombremascota=" + nombremascota + ", genero=" + genero + ", especie=" + especie + ", ubicacion=" + ubicacion + ", raza=" + raza + ", edad=" + edad + ", disponible=" + disponible + '}';
    }

    
}
