package EJ07;

public abstract class Participante {
    private String codigoInscripcion;

    public Participante(String codigoInscripcion) {
        this.codigoInscripcion = codigoInscripcion;
    }

    public String getCodigoInscripcion() {return codigoInscripcion;}
}
