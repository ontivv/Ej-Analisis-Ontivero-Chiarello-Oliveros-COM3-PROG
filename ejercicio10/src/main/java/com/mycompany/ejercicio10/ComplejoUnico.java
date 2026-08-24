/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio10;

/**
 *
 * @author joaquin
 */
public class ComplejoUnico extends ComplejoDeportivo {
    private String informacionUnico;

    public ComplejoUnico(String localizacion, String jefeOrganizacion, double areaOcupada, String informacionUnico) {
        super(localizacion, jefeOrganizacion, areaOcupada); // Llama al constructor del padre
        this.informacionUnico = informacionUnico;
    }
}