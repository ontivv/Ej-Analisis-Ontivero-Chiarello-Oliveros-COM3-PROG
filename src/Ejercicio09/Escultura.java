package Ejercicio09;

public class Escultura extends ObjetoArte {
    private String material;
    private double altura;
    private double peso;
    private String estilo;

    public Escultura(String id, String titulo, int anioCreacion, String descripcion, Pertenencia pertenencia, Origen origen, Artista artista, String material, double altura, double peso, String estilo) {
        super(id, titulo, anioCreacion, descripcion, pertenencia, origen, artista);
        this.material = material;
        this.altura = altura;
        this.peso = peso;
        this.estilo = estilo;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }

    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getEstilo() { return estilo; }
    public void setEstilo(String estilo) { this.estilo = estilo; }
}
