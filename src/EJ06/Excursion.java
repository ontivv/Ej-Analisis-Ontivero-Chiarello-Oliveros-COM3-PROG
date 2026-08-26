package Ejercicio06;

public class Excursion {
    private String codigo;
    private String dia;
    private String hora;

    public Excursion(String codigo, String hora, String dia) {
        this.codigo = codigo;
        this.hora = hora;
        this.dia = dia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
