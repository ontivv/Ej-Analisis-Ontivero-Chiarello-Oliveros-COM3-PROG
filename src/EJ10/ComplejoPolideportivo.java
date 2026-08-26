package com.mycompany.ejercicio10;

public class ComplejoPolideportivo extends ComplejoDeportivo {
    private String informacionPoli;

    public ComplejoPolideportivo(String localizacion, String jefeOrganizacion, double areaOcupada, String informacionPoli) {
        super(localizacion, jefeOrganizacion, areaOcupada);
        this.informacionPoli = informacionPoli;
    }
}