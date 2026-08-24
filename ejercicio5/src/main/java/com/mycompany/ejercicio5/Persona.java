/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;



import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private int edad;
    
    
    private List<Restaurante> restaurantesQueConcurre;
    
    private List<OfertaPlato> platosQueLeGustan;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.restaurantesQueConcurre = new ArrayList<>();
        this.platosQueLeGustan = new ArrayList<>();
    }

    public void agregarRestaurante(Restaurante restaurante) {
        this.restaurantesQueConcurre.add(restaurante);
    }

    public void agregarGusto(OfertaPlato oferta) {
        this.platosQueLeGustan.add(oferta);
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    public List<Restaurante> getRestaurantesQueConcurre() { return restaurantesQueConcurre; }
    public List<OfertaPlato> getPlatosQueLeGustan() { return platosQueLeGustan; }
}