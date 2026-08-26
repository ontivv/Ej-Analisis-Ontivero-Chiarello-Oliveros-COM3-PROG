package Ejercicio06;

import java.util.ArrayList;
import java.util.List;

public class Personal {
    private String nombre;
    private String dni;
    private String direccion;
    private String telefono;
    private double sueldo;
    private String numeroSeguridadSocial;
    private List<Rol> roles;

    public Personal(String nombre, String dni, String direccion, String telefono, double sueldo, String numeroSeguridadSocial) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.roles = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public void agregarRol(Rol nuevoRol) {
        this.roles.add(nuevoRol);
    }
}
