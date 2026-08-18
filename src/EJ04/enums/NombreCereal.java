package EJ04.enums;

public enum NombreCereal {
    GIRASOL(TipoCereal.COSECHA_GRUESA),
    MAIZ(TipoCereal.COSECHA_GRUESA),
    TRIGO(TipoCereal.COSECHA_FINA),
    AVENA(TipoCereal.COSECHA_FINA),
    ALFALFA(TipoCereal.PASTURA),
    TREBOL_SUBTERRANEO(TipoCereal.PASTURA);

    private final TipoCereal clasificacion;

    NombreCereal(TipoCereal clasificacion) {
        this.clasificacion = clasificacion;
    }

    public TipoCereal getClasificacion() {return clasificacion;}
}
