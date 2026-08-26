package Ejercicio03;

public class Ciudad {
    private String nombre;
    private int habitantes;
    private double gastosMantenimiento;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;

    public Ciudad(String nombre,int habitantes, double gastosMantenimiento, double imp1, double imp2, double imp3, double imp4, double imp5) {
        this.nombre = nombre;
        this.habitantes = habitantes;
        this.gastosMantenimiento = gastosMantenimiento;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
    }
    public double obtenerRecaudacionTotal() {
        double recaudacionTotal = imp1 + imp2 + imp3 + imp4 + imp5;
        return recaudacionTotal;
    }
    public boolean tieneDeficit() {
        if (habitantes <= 100_000) {
            return false;
        } else {
            if (gastosMantenimiento > obtenerRecaudacionTotal()) {
                return true;
            }return false;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getHabitantes() {
        return habitantes;
    }
}
