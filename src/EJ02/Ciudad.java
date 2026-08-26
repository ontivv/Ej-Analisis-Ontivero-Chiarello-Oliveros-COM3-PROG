package com.mycompany.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    private String nombre;
    private int poblacion;
    private Provincia provincia; 

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void setPoblacion(int poblacion) {
        if (poblacion >= 0) {
            this.poblacion = poblacion;
        }
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
}