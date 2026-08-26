package com.mycompany.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private Pais pais; 
    private Ciudad capital; 
    private List<Ciudad> ciudades = new ArrayList<>(); 
    
    private List<Provincia> provinciasLimitrofes = new ArrayList<>();
    private List<Pais> paisesLimitrofes = new ArrayList<>();

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

   
    public void agregarCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
        ciudad.setProvincia(this); 
    }

    public void agregarProvinciaLimitrofe(Provincia provincia) {
        this.provinciasLimitrofes.add(provincia);
    }

    public void agregarPaisLimitrofe(Pais pais) {
        this.paisesLimitrofes.add(pais);
    }

    
}