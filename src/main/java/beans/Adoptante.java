package beans;

public class Adoptante {
    private String username;
    private String clave;
    private String nombre;
    private String apellido;
    private String ciudad;
    private String email;
    private Double petcoin;
    private boolean contribuyente;

    public Adoptante(String username, String clave, String nombre, String apellido, String ciudad, String email, Double petcoin, boolean contribuyente) {
        this.username = username;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.ciudad = ciudad;
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        return "Adoptante{" + "username=" + username + ", clave=" + clave + ", nombre=" + nombre + ", apellido=" + apellido + ", ciudad=" + ciudad + ", email=" + email + ", petcoin=" + petcoin + ", contribuyente=" + contribuyente + '}';
    }
    
    
    
}
