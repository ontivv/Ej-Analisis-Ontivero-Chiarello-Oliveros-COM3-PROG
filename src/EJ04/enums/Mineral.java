package EJ04.enums;

public enum Mineral {
    // Definimos minerales y tambien definimos si son de interes primario (true) o secundario (false)
    NITROGENO(true),
    FOSFORO(true),
    POTASIO(false),
    CALCIO(false),
    AZUFRE(false);

    private final boolean esPrimario;

    Mineral(boolean esPrimario) {
        this.esPrimario = esPrimario;
    }

    public boolean isEsPrimario() {return esPrimario;}
}
