package EJ07;

import java.time.LocalDate;

public class RegistroCompetencia {
    private Participante participante;
    private Prueba prueba;
    private Pista pista;
    private LocalDate fechaCompetencia;
    private double tiempoEmpleado;
    private int posicionObtenida;


    public RegistroCompetencia(Participante participante, Prueba prueba, LocalDate fechaCompetencia) {
        this.participante = participante;
        this.prueba = prueba;
        this.fechaCompetencia = fechaCompetencia;

        this.tiempoEmpleado = 0.0;
        this.posicionObtenida = 0;
    }

    public void registrarResultados(double tiempo, int posicion) {
        this.tiempoEmpleado = tiempo;
        this.posicionObtenida = posicion;
    }

    public Participante getParticipante() {return participante;}
    public Prueba getPrueba() {return prueba;}
    public Pista getPista() {return pista;}
    public LocalDate getFechaCompetencia() {return fechaCompetencia;}
    public double getTiempoEmpleado() {return tiempoEmpleado;}
    public int getPosicionObtenida() {return posicionObtenida;}
}
