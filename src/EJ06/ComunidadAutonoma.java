package Ejercicio06;

public class ComunidadAutonoma {
    private String nombre;
    private String organismoResponsable;

    public ComunidadAutonoma(String nombre, String organismoResponsable) {
        this.nombre = nombre;
        this.organismoResponsable = organismoResponsable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrganismoResponsable() {
        return organismoResponsable;
    }

    public void setOrganismoResponsable(String organismoResponsable) {
        this.organismoResponsable = organismoResponsable;
    }
}
