package Ejercicio09;

import java.util.Date;

public class Permanente extends Pertenencia {
    private Date fechaAdquisicion;
    private double coste;
    private boolean enExposicion;

    public Permanente(Date fechaAdquisicion, double coste, boolean enExposicion) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.coste = coste;
        this.enExposicion = enExposicion;
    }

    public Date getFechaAdquisicion() { return fechaAdquisicion; }
    public void setFechaAdquisicion(Date fechaAdquisicion) { this.fechaAdquisicion = fechaAdquisicion; }

    public double getCoste() { return coste; }
    public void setCoste(double coste) { this.coste = coste; }

    public boolean isEnExposicion() { return enExposicion; }
    public void setEnExposicion(boolean enExposicion) { this.enExposicion = enExposicion; }
}