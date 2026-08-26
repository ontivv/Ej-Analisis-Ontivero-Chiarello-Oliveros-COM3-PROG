package EJ04;

import EJ04.enums.Mineral;
import EJ04.enums.NombreCereal;
import EJ04.enums.TipoCereal;

import java.util.ArrayList;
import java.util.List;

public class Cereal {
    private NombreCereal nombre;
    private TipoCereal tipoCereal;
    private List<Mineral> mineralesRequeridos;

    public Cereal(NombreCereal nombre) {
        this.nombre = nombre;
        this.tipoCereal = nombre.getClasificacion();
        this.mineralesRequeridos = new ArrayList<>();
    }

    public void agregarMineralRequerido(Mineral mineral) {
        this.mineralesRequeridos.add(mineral);
    }

    public NombreCereal getNombre() {return nombre;}
    public TipoCereal getTipoCereal() {return tipoCereal;}
    public List<Mineral> getMineralesRequeridos() {return mineralesRequeridos;}
}
