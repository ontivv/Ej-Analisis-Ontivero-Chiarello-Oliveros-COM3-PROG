package Ejercicio11;
import java.util.Date;

public class Ticket {
    private Date fecha;
    private double precioAplicado;
    private Producto producto;

    public Ticket(Date fecha, double precioAplicado, Producto producto) {
        this.fecha = fecha;
        this.precioAplicado = precioAplicado;
        this.producto = producto;
    }

    public Date getFecha() { return fecha; }
    public void setFecha(Date fecha) { this.fecha = fecha; }

    public double getPrecioAplicado() { return precioAplicado; }
    public void setPrecioAplicado(double precioAplicado) { this.precioAplicado = precioAplicado; }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto producto) { this.producto = producto; }
}