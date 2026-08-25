package Ejercicio09;

public class ObjetoArte {
    private String id;
    private String titulo;
    private int anioCreacion;
    private String descripcion;
    private Pertenencia pertenencia;
    private Origen origen;
    private Artista artista;

    public ObjetoArte(String id, String titulo, int anioCreacion, String descripcion, Pertenencia pertenencia, Origen origen, Artista artista) {
        this.id = id;
        this.titulo = titulo;
        this.anioCreacion = anioCreacion;
        this.descripcion = descripcion;
        this.pertenencia = pertenencia;
        this.origen = origen;
        this.artista = artista;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public int getAnioCreacion() { return anioCreacion; }
    public void setAnioCreacion(int anioCreacion) { this.anioCreacion = anioCreacion; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Pertenencia getPertenencia() { return pertenencia; }
    public void setPertenencia(Pertenencia pertenencia) { this.pertenencia = pertenencia; }

    public Origen getOrigen() { return origen; }
    public void setOrigen(Origen origen) { this.origen = origen; }

    public Artista getArtista() { return artista; }
    public void setArtista(Artista artista) { this.artista = artista; }
}