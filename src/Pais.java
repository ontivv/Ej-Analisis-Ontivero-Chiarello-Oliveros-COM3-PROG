import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String nombre;
    private List<Provincia> provincias;

    public Pais(String nombre, List<Provincia> provincias) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }
    public void agregarProvincia(Provincia p) {
        this.provincias.add(p);
    }
    public List<Ciudad> obtenerCiudadesConDeficit() {
        List<Ciudad> ciudadesEnDeficit = new ArrayList<>();
        for (Provincia p : provincias) {
            for (Ciudad c : p.getCiudades()) {
                if (c.tieneDeficit()) {
                    ciudadesEnDeficit.add(c);
                }
            }
        } return ciudadesEnDeficit;
    }
    public List<Provincia> obtenerProvinciasConDeficit() {
        List<Provincia> provinciasEnDeficit = new ArrayList<>();
        for (Provincia p : provincias) {
            if (p.tieneMasDeLaMitadEnDeficit()) {
                provinciasEnDeficit.add(p);
            }
        } return provinciasEnDeficit;
    }
}
