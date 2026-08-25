package EJ07;

public class Federacion {
    private String nombre;
    private int numeroFederados;

    public Federacion(String nombre, int numeroFederados) {
        this.nombre = nombre;
        this.numeroFederados = numeroFederados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroFederados() {
        return numeroFederados;
    }

    public void registrarNuevoFederado() {
        this.numeroFederados++;
    }
}