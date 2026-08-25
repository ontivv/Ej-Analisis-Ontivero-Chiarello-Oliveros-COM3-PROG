package Ejercicio09;

public class Pintura extends ObjetoArte {
    private String tipoPintura;
    private String soporte;
    private String estilo;

    public Pintura(String id, String titulo, int anioCreacion, String descripcion, Pertenencia pertenencia, Origen origen, Artista artista, String tipoPintura, String soporte, String estilo) {
        super(id, titulo, anioCreacion, descripcion, pertenencia, origen, artista);
        this.tipoPintura = tipoPintura;
        this.soporte = soporte;
        this.estilo = estilo;
    }

    public String getTipoPintura() { return tipoPintura; }
    public void setTipoPintura(String tipoPintura) { this.tipoPintura = tipoPintura; }

    public String getSoporte() { return soporte; }
    public void setSoporte(String soporte) { this.soporte = soporte; }

    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; }
}