
package beans;
//hola

public class Mascota {
    private int idmascota;
    private String nombremascota;
    private String genero;
    private String especie;
    private String ubicacion;
    private String raza;
    private int edad;
    private boolean disponible;  

    public Mascota(int idmascota, String nombremascota, String genero, String especie, String ubicacion, String raza, int edad, boolean disponible) {
        this.idmascota = idmascota;
        this.nombremascota = nombremascota;
        this.genero = genero;
        this.especie = especie;
        this.ubicacion = ubicacion;
        this.raza = raza;
        this.edad = edad;
        this.disponible = disponible;
    }

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
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
        return "Mascota{" + "idmascota=" + idmascota + ", nombremascota=" + nombremascota + ", genero=" + genero + ", especie=" + especie + ", ubicacion=" + ubicacion + ", raza=" + raza + ", edad=" + edad + ", disponible=" + disponible + '}';
    }
    
    
   
}
