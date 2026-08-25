package EJ07;

import java.util.ArrayList;
import java.util.List;

public class Estacion {
    private int codigoIdentificativo;
    private String nombre;
    private List<String> personasContacto;
    private String direccion;
    private String telefono;
    private int kmsEsquiables;

    private List<Pista> pistas;
    private List<Federacion> federacionesAdministradoras;

    public Estacion(int codigoIdentificativo, String nombre, String direccion, String telefono, int kmsEsquiables) {
        this.codigoIdentificativo = codigoIdentificativo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.kmsEsquiables = kmsEsquiables;

        this.personasContacto = new ArrayList<>();
        this.pistas = new ArrayList<>();
        this.federacionesAdministradoras = new ArrayList<>();
    }

    public void agregarFederacionAdministradora(Federacion federacion) {
        this.federacionesAdministradoras.add(federacion);
    }

    public void agregarPista(Pista pista) {
        this.pistas.add(pista);
    }

    public int getNumeroPistas() {return this.pistas.size();}
    public int getCodigoIdentificativo() {return codigoIdentificativo;}
    public String getNombre() {return nombre;}
    public String getDireccion() {return direccion;}
    public List<String> getPersonasContacto() {return personasContacto;}
    public String getTelefono() {return telefono;}
    public int getKmsEsquiables() {return kmsEsquiables;}
    public List<Pista> getPistas() {return pistas;}
    public List<Federacion> getFederacionesAdministradoras() {return federacionesAdministradoras;}

    public void agregarPersonaContacto(String persona) {
        this.personasContacto.add(persona);
    }

    public void eliminarPersonaContacto(String persona) {
        this.personasContacto.remove(persona);
    }
}
