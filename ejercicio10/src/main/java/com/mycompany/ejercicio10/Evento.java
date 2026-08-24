/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10;

/**
 *
 * @author joaquin
 */
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Evento {
    private Date fecha;
    private int duracionMinutos;
    private int numeroParticipantes;
    private int numeroComisarios;
    
    // Relación muchos a muchos con Comisario
    private List<Comisario> comisarios;
    
    // Relación de composición con Material
    private List<Material> materiales;

    public Evento(Date fecha, int duracionMinutos, int numeroParticipantes, int numeroComisarios) {
        this.fecha = fecha;
        this.duracionMinutos = duracionMinutos;
        this.numeroParticipantes = numeroParticipantes;
        this.numeroComisarios = numeroComisarios;
        this.comisarios = new ArrayList<>();
        this.materiales = new ArrayList<>();
    }
}