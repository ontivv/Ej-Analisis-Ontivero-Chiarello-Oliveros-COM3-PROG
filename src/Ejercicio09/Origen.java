package Ejercicio09;

public class Origen {
    private String pais;
    private String cultura;
    private String epoca;

    public Origen(String pais, String cultura, String epoca) {
        this.pais = pais;
        this.cultura = cultura;
        this.epoca = epoca;
    }

    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }

    public String getCultura() { return cultura; }
    public void setCultura(String cultura) { this.cultura = cultura; }

    public String getEpoca() { return epoca; }
    public void setEpoca(String epoca) { this.epoca = epoca; }
}