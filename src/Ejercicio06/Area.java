package Ejercicio06;

public class Area {
    private String nombre;
    private double km2;

    public Area(String nombre, double km2) {
        this.nombre = nombre;
        this.km2 = km2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getKm2() {
        return km2;
    }

    public void setKm2(double km2) {
        this.km2 = km2;
    }
}
