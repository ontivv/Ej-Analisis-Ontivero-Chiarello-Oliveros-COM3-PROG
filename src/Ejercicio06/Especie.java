package Ejercicio04;

public class Especie {
    private String nombreCientifico;
    private String nombreVulgar;

    public Especie(String nombreVulgar, String nombreCientifico) {
        this.nombreVulgar = nombreVulgar;
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getNombreVulgar() {
        return nombreVulgar;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public void setNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }
}
