package com.mycompany.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public abstract class ComplejoDeportivo {
    private String localizacion;
    private String jefeOrganizacion;
    private double areaOcupada;
    
    // Relación de composición con Área Deportiva
    private List<AreaDeportiva> areas;
    
    // Relación de agregación con Evento
    private List<Evento> eventos;

    public ComplejoDeportivo(String localizacion, String jefeOrganizacion, double areaOcupada) {
        this.localizacion = localizacion;
        this.jefeOrganizacion = jefeOrganizacion;
        this.areaOcupada = areaOcupada;
        this.areas = new ArrayList<>();
        this.eventos = new ArrayList<>();
    }
}