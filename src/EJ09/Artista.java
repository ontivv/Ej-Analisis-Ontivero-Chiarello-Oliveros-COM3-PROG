package Ejercicio09;

import java.util.Date;

public class Artista {
    private String nombre;
    private Date fechaNacimiento;
    private Date fechaDefuncion;
    private String paisOrigen;
    private String epoca;
    private String estiloPrincipal;
    private String descripcion;

    public Artista(String nombre, Date fechaNacimiento, Date fechaDefuncion, String paisOrigen, String epoca, String estiloPrincipal, String descripcion) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaDefuncion = fechaDefuncion;
        this.paisOrigen = paisOrigen;
        this.epoca = epoca;
        this.estiloPrincipal = estiloPrincipal;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Date getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(Date fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public Date getFechaDefuncion() { return fechaDefuncion; }
    public void setFechaDefuncion(Date fechaDefuncion) { this.fechaDefuncion = fechaDefuncion; }

    public String getPaisOrigen() { return paisOrigen; }
    public void setPaisOrigen(String paisOrigen) { this.paisOrigen = paisOrigen; }

    public String getEpoca() { return epoca; }
    public void setEpoca(String epoca) { this.epoca = epoca; }

    public String getEstiloPrincipal() { return estiloPrincipal; }
    public void setEstiloPrincipal(String estiloPrincipal) { this.estiloPrincipal = estiloPrincipal; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}