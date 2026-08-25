package EJ07;

import EJ07.enums.DificultadPista;

public class Pista {
    private int identificador;
    private int longitud;
    private DificultadPista dificultad;

    public Pista(int identificador, int longitud, DificultadPista dificultad) {
        this.identificador = identificador;
        this.longitud = longitud;
        this.dificultad = dificultad;
    }

    public int getIdentificador() {return identificador;}
    public int getLongitud() {return longitud;}
    public DificultadPista getDificultad() {return dificultad;}
}
