
package com.mycompany.ejercicio5;

public class OfertaPlato {
    private Restaurante restaurante;
    private Plato plato;
    private String como_se_sirve;

    public OfertaPlato(Restaurante restaurante, Plato plato, String como_se_sirve) {
        this.restaurante = restaurante;
        this.plato = plato;
        this.como_se_sirve = como_se_sirve;
    }

    // Getters y Setters
    public Restaurante getRestaurante() { return restaurante; }
    public void setRestaurante(Restaurante restaurante) { this.restaurante = restaurante; }
    public Plato getPlato() { return plato; }
    public void setPlato(Plato plato) { this.plato = plato; }
    public String getComo_se_sirve() { return como_se_sirve; }
    public void setComo_se_sirve(String como_se_sirve) { this.como_se_sirve = como_se_sirve; }
}