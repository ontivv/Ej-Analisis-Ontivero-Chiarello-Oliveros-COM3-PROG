/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

public class Plato {
    private String nombre;
    private String ingredientesPrincipal;

    public Plato(String nombre, String ingredientesPrincipal) {
        this.nombre = nombre;
        this.ingredientesPrincipal = ingredientesPrincipal;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getIngredientesPrincipal() { return ingredientesPrincipal; }
    public void setIngredientesPrincipal(String ingredientesPrincipal) { this.ingredientesPrincipal = ingredientesPrincipal; }
}