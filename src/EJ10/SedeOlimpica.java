package com.mycompany.ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class SedeOlimpica {
    private int numeroComplejos;
    private double presupuestoAproximado;
    
    // Relación de composición: 1 Sede tiene de 1 a n Complejos
    private List<ComplejoDeportivo> complejos;

    public SedeOlimpica(int numeroComplejos, double presupuestoAproximado) {
        this.numeroComplejos = numeroComplejos;
        this.presupuestoAproximado = presupuestoAproximado;
        this.complejos = new ArrayList<>(); // Inicializamos la lista
    }
}