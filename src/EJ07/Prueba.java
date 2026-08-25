package EJ07;

import EJ07.enums.TipoPrueba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Prueba {
    private String nombre;
    private TipoPrueba tipo;
    private List<LocalDate> fechasPrevistas;

    private Participante vencedor;
    private double tiempoVencedor;

    public Prueba(String nombre, TipoPrueba tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechasPrevistas = new ArrayList<>();
    }

    public void agregarFechaPrevista(LocalDate fecha) {
        this.fechasPrevistas.add(fecha);
    }

    public void registrarGanador(Participante vencedor, double tiempo) {
        this.vencedor = vencedor;
        this.tiempoVencedor = tiempo;
    }

    public String getNombre() {return nombre;}
    public TipoPrueba getTipo() {return tipo;}
    public List<LocalDate> getFechasPrevistas() {return fechasPrevistas;}
    public Participante getVencedor() {return vencedor;}
    public double getTiempoVencedor() {return tiempoVencedor;}
}
