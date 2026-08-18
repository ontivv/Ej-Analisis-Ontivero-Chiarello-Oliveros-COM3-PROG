import java.util.List;
import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;

    public Provincia(String nombre, List<Ciudad> ciudades) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }
    public void agregarCiudad(Ciudad ciudad) {
        this.ciudades.add(ciudad);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }
    public boolean tieneMasDeLaMitadEnDeficit() {
        int ciudadesControladas = 0;
        int contadorDeficit = 0;


        for (Ciudad c : ciudades) {
            if (c.getHabitantes() > 100_000) {
                ciudadesControladas += 1;
                if (c.tieneDeficit()) {
                    contadorDeficit += 1;
                }
            }
        }
        if (ciudadesControladas == 0) {
            return false;
        }
        if (contadorDeficit > (ciudadesControladas / 2.0)) {
            return true;
        }
        return false;
    }

}

