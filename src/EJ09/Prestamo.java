package Ejercicio09;

import java.util.Date;

public class Prestamo extends Pertenencia {
    private Date fechaRecepcion;
    private Date fechaDevolucion;
    private ColeccionExterna coleccionExterna; // Relación con la colección

    public Prestamo(Date fechaRecepcion, Date fechaDevolucion, ColeccionExterna coleccionExterna) {
        this.fechaRecepcion = fechaRecepcion;
        this.fechaDevolucion = fechaDevolucion;
        this.coleccionExterna = coleccionExterna;
    }

    public Date getFechaRecepcion() { return fechaRecepcion; }
    public void setFechaRecepcion(Date fechaRecepcion) { this.fechaRecepcion = fechaRecepcion; }

    public Date getFechaDevolucion() { return fechaDevolucion; }
    public void setFechaDevolucion(Date fechaDevolucion) { this.fechaDevolucion = fechaDevolucion; }

    public ColeccionExterna getColeccionExterna() { return coleccionExterna; }
    public void setColeccionExterna(ColeccionExterna coleccionExterna) { this.coleccionExterna = coleccionExterna; }
}