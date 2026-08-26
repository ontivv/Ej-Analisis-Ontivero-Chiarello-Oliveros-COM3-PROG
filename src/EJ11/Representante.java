package Ejercicio11;
import java.util.Date;

public abstract class Representante extends Persona {
    private String cuitCuil;
    private Date fechaIncorporacion;

    public Representante(String nombre, String direccion, String telefono, Date fechaNacimiento, String cuitCuil, Date fechaIncorporacion) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cuitCuil = cuitCuil;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public String getCuitCuil() { return cuitCuil; }
    public void setCuitCuil(String cuitCuil) { this.cuitCuil = cuitCuil; }

    public Date getFechaIncorporacion() { return fechaIncorporacion; }
    public void setFechaIncorporacion(Date fechaIncorporacion) { this.fechaIncorporacion = fechaIncorporacion; }
}