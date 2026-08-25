package Ejercicio09;

import java.util.Date;

public class Exposicion {
    private String nombre;
    private Date fechaComienzo;
    private Date fechaFinalizacion;

    public Exposicion(String nombre, Date fechaComienzo, Date fechaFinalizacion) {
        this.nombre = nombre;
        this.fechaComienzo = fechaComienzo;
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Date getFechaComienzo() { return fechaComienzo; }
    public void setFechaComienzo(Date fechaComienzo) { this.fechaComienzo = fechaComienzo; }

    public Date getFechaFinalizacion() { return fechaFinalizacion; }
    public void setFechaFinalizacion(Date fechaFinalizacion) { this.fechaFinalizacion = fechaFinalizacion; }
}