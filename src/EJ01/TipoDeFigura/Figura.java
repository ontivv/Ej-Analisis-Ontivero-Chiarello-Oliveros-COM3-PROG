package EJ01.TipoDeFigura;

public abstract class Figura {
    private String tipoFigura;

    public Figura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public String getTipoFigura() {return tipoFigura;}
}
