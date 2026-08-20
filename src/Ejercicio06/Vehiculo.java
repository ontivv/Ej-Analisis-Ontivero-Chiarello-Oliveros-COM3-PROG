package Ejercicio04;

public class Vehiculo {
    private String tipo;
    private String matricula;

    public Vehiculo(String tipo, String matricula) {
        this.tipo = tipo;
        this.matricula = matricula;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
