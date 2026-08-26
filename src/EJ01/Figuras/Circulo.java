package EJ01.Figuras;

import EJ01.TipoDeFigura.Elipse;

public class Circulo extends Elipse {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    public double getRadio() {return radio;}
}
