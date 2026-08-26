package com.mycompany.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nombre;
    private List<Pais> paises = new ArrayList<>(); 

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    public void agregarPais(Pais pais) {
        this.paises.add(pais);
    }

}