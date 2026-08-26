package EJ01.TipoDeFigura;

import EJ01.DatosDeFiguras.Lado;

import java.util.ArrayList;
import java.util.List;

public class Poligono extends Figura {
    private int numeroDeLados;
    private List<Lado> lados = new ArrayList<Lado>();

    public Poligono(String tipoFigura, int numeroDeLados) {
        super(tipoFigura);
        this.numeroDeLados = numeroDeLados;
        this.lados = new ArrayList<>();
    }

    public void agregarLado(Lado lado) {
        this.lados.add(lado);
    }

    public int getNumeroDeLados() {return numeroDeLados;}
    public List<Lado> getLados() {return lados;}
}
