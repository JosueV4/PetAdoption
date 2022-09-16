package beans;

public class Adoptante {
    private String username;
    private String contrasena;
    private String nombre;
    private String apellidos;
    private String ciudad;
    private String email;
    private Double petcoin;
    private boolean contribuyente;

    public Adoptante(String username, String contrasena, String nombre, String apellidos, String ciudad, String email, Double petcoin, boolean contribuyente) {
        this.username = username;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.email = email;
        this.petcoin = petcoin;
        this.contribuyente = contribuyente;
    }

    public Adoptante(String username, String contrasena, String nombre, String apellidos, String email, double petcoin, boolean contribuyente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getcontrasena() {
        return contrasena;
    }

    public void setcontrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellidos() {
        return apellidos;
    }

    public void setapellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getPetcoin() {
        return petcoin;
    }

    public void setPetcoin(Double petcoin) {
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
        return "Adoptante{" + "username=" + username + ", contrasena=" + contrasena + ", nombre=" + nombre + ", apellidos=" + apellidos + ", ciudad=" + ciudad + ", email=" + email + ", petcoin=" + petcoin + ", contribuyente=" + contribuyente + '}';
    }
    
    
    
}
