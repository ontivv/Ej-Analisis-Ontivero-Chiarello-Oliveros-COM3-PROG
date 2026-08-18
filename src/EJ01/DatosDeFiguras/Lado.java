package EJ01.DatosDeFiguras;

public class Lado {
    private Punto punto1;
    private Punto punto2;

    public Lado(Punto p1, Punto p2) {
        this.punto1 = p1;
        this.punto2 = p2;
    }

    public Punto getPunto1() {return punto1;}
    public Punto getPunto2() {return punto2;}
}
