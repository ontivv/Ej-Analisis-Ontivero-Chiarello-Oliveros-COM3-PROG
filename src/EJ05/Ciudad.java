/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Ciudad {
    private String nombre;
    private String descripcion;
    private List<Restaurante> restaurantes; // Relación de agregación (1 a *)

    public Ciudad(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.restaurantes = new ArrayList<>();
    }

    public void agregarRestaurante(Restaurante restaurante) {
        this.restaurantes.add(restaurante);
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public List<Restaurante> getRestaurantes() { return restaurantes; }
}