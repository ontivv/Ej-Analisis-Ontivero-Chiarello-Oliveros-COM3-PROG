package Ejercicio11;
import java.util.Date;

public class Cliente extends Persona {
    private Date fechaIngreso;

    public Cliente(String nombre, String direccion, String telefono, Date fechaNacimiento, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaIngreso() { return fechaIngreso; }
    public void setFechaIngreso(Date fechaIngreso) { this.fechaIngreso = fechaIngreso; }
}