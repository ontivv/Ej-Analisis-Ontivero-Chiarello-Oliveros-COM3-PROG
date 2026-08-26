package Ejercicio11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empresa {
    private double porcentajeComision;
    private Date ultimaReunion;
    private Date proximaReunion;
    private List<Producto> catalogoProductos;
    private List<Representante> fuerzaDeVentas;

    public Empresa(double porcentajeComision, Date ultimaReunion, Date proximaReunion) {
        this.porcentajeComision = porcentajeComision;
        this.ultimaReunion = ultimaReunion;
        this.proximaReunion = proximaReunion;
        this.catalogoProductos = new ArrayList<>();
        this.fuerzaDeVentas = new ArrayList<>();
    }

    public double getPorcentajeComision() { return porcentajeComision; }
    public void setPorcentajeComision(double porcentajeComision) { this.porcentajeComision = porcentajeComision; }

    public Date getUltimaReunion() { return ultimaReunion; }
    public void setUltimaReunion(Date ultimaReunion) { this.ultimaReunion = ultimaReunion; }

    public Date getProximaReunion() { return proximaReunion; }
    public void setProximaReunion(Date proximaReunion) { this.proximaReunion = proximaReunion; }

    public List<Producto> getCatalogoProductos() { return catalogoProductos; }
    public void setCatalogoProductos(List<Producto> catalogoProductos) { this.catalogoProductos = catalogoProductos; }

    public List<Representante> getFuerzaDeVentas() { return fuerzaDeVentas; }
    public void setFuerzaDeVentas(List<Representante> fuerzaDeVentas) { this.fuerzaDeVentas = fuerzaDeVentas; }

    public void agregarProducto(Producto producto) {
        this.catalogoProductos.add(producto);
    }

    public void agregarRepresentante(Representante representante) {
        this.fuerzaDeVentas.add(representante);
    }
}