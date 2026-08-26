package Ejercicio06;

public class EspecieAnimal extends Especie {
    private String periodoCelo;

    public String getPeriodoCelo() {
        return periodoCelo;
    }

    public void setPeriodoCelo(String periodoCelo) {
        this.periodoCelo = periodoCelo;
    }

    public EspecieAnimal(String nombreVulgar, String nombreCientifico, String periodoCelo) {
        super(nombreVulgar, nombreCientifico);
        this.periodoCelo = periodoCelo;
    }
}
