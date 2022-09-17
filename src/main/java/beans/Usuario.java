/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author ingyo
 */
public class Usuario {

    private String username;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String email;
    private double petcoin;
    private boolean contribuyente;

    public Usuario(String username, String contrasena, String nombre, String apellidos, String email, double petcoin, boolean contribuyente) {
        this.username = username;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.petcoin = petcoin;
        this.contribuyente = contribuyente;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPetcoin() {
        return petcoin;
    }

    public void setPetcoin(double petcoin) {
        this.petcoin = petcoin;
    }

    public boolean isContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(boolean contribuyente) {
        this.contribuyente = contribuyente;
    }

    
    
    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", petcoin=" + petcoin + ", contribuyente=" + contribuyente + '}';
    }



}