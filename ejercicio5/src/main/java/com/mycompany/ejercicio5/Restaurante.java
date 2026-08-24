/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private String nombre;
    private String tipoDeComida;
    private List<Sucursal> sucursales; // Relación 1 a *
    private List<Plato> platos;        // Relación 1 a 1..20

    public Restaurante(String nombre, String tipoDeComida) {
        this.nombre = nombre;
        this.tipoDeComida = tipoDeComida;
        this.sucursales = new ArrayList<>();
        this.platos = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal sucursal) {
        this.sucursales.add(sucursal);
    }

    //controla la regla de negocio de "no más de 20 platos"
    public void agregarPlato(Plato plato) throws Exception {
        if (this.platos.size() < 20) {
            this.platos.add(plato);
        } else {
            throw new Exception("El restaurante ya alcanzó el límite máximo de 20 platos.");
        }
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipoDeComida() { return tipoDeComida; }
    public void setTipoDeComida(String tipoDeComida) { this.tipoDeComida = tipoDeComida; }
    public List<Sucursal> getSucursales() { return sucursales; }
    public List<Plato> getPlatos() { return platos; }
}