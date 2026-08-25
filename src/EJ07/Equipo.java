package EJ07;

import java.util.ArrayList;
import java.util.List;

public class Equipo extends Participante {
    private String entrenador;
    private List<Esquiador> esquiadores;

    public Equipo(String codigoInscripcion, String entrenador) {
        super(codigoInscripcion);
        this.entrenador = entrenador;
        this.esquiadores = new ArrayList<>();
    }
}
