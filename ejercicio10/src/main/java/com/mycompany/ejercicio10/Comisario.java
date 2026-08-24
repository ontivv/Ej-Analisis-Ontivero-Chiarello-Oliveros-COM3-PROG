/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10;

/**
 *
 * @author joaquin
 */
import java.util.ArrayList;
import java.util.List;

public class Comisario {
    private String nombre;
    
    // Relación muchos a muchos con Evento (El otro lado de la relación)
    private List<Evento> eventosInvolucrados;

    public Comisario(String nombre) {
        this.nombre = nombre;
        this.eventosInvolucrados = new ArrayList<>();
    }
}