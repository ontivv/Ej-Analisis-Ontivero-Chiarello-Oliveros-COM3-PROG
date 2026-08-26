package EJ07;

import java.time.LocalDate;
import java.time.Period;

public class Esquiador extends Participante {
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private Federacion federacion;
    private Equipo equipoAsignado;

    // Constructor
    public Esquiador(String codigoInscripcion, String dni, String nombre, LocalDate fechaNacimiento, Federacion federacion) {
        super(codigoInscripcion);
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.federacion = federacion;
        this.equipoAsignado = null; // Arranca por defecto como individual
    }

    public int getEdad() {
        return Period.between(this.fechaNacimiento, LocalDate.now()).getYears();
    }

    public boolean esIndividual() {
        return this.equipoAsignado == null;
    }

    public void asignarEquipo(Equipo equipo) {
        this.equipoAsignado = equipo;
    }

    public String getNombre() {return nombre;}
    public String getDni() {return dni;}
    public Equipo getEquipoAsignado() {return equipoAsignado;}
}
