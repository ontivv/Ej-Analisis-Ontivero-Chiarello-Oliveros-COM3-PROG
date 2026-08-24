package com.mycompany.ejercicio5;


public class Ejercicio5 {
    public static void main(String[] args) {
        try {
            Restaurante rest1 = new Restaurante("La Parrilla del Tío", "Carnes");
            Plato asado = new Plato("Asado de Tira", "Carne de vaca, sal");
            
            rest1.agregarPlato(asado);
            
            OfertaPlato asadoEnLaParrilla = new OfertaPlato(rest1, asado, "Servido en tabla de madera con chimichurri");
            
            Persona juan = new Persona("Juan", 30);
            juan.agregarRestaurante(rest1);
            juan.agregarGusto(asadoEnLaParrilla); 
            
            System.out.println("A " + juan.getNombre() + " le gusta el " + 
                    juan.getPlatosQueLeGustan().get(0).getPlato().getNombre() + 
                    " porque es " + juan.getPlatosQueLeGustan().get(0).getComo_se_sirve());
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}