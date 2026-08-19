package Ejercicio04;

public class Investigador extends Rol{
    private String titulacion;

    public Investigador(String titulacion) {
        this.titulacion = titulacion;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

}
