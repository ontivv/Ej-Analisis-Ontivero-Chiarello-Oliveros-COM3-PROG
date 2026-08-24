package com.mycompany.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private Continente continente; 
    private Ciudad capital; 
    private List<Provincia> provincias = new ArrayList<>(); 
    private List<Pais> paisesLimitrofes = new ArrayList<>(); 

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void agregarProvincia(Provincia provincia) {
        this.provincias.add(provincia);
    }

    public void agregarPaisLimitrofe(Pais pais) {
        this.paisesLimitrofes.add(pais);
    }

}