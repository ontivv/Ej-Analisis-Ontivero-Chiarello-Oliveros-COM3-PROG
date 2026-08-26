package Ejercicio11;
import java.util.Date;

public class Lider extends Representante {
    private Date fechaPromocion;

    public Lider(String nombre, String direccion, String telefono, Date fechaNacimiento, String cuitCuil, Date fechaIncorporacion, Date fechaPromocion) {
        super(nombre, direccion, telefono, fechaNacimiento, cuitCuil, fechaIncorporacion);
        this.fechaPromocion = fechaPromocion;
    }

    public Date getFechaPromocion() { return fechaPromocion; }
    public void setFechaPromocion(Date fechaPromocion) { this.fechaPromocion = fechaPromocion; }
}