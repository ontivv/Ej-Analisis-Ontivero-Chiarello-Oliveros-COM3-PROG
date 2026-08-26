package EJ04;

import EJ04.enums.Mineral;
import EJ04.enums.TipoLote;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int numeroLote;
    private TipoLote tipoLote;
    private List<Mineral> mineralesContenidos;
    private List<Cereal> historialSiembra; // Para guardar lo que ya se plantó

    public Lote(int numeroLote) {
        this.numeroLote = numeroLote;
        this.mineralesContenidos = new ArrayList<>();
        this.historialSiembra = new ArrayList<>();
        this.tipoLote = TipoLote.COMUN; //valor por defecto
    }

    public void agregarMineral(Mineral mineral) {
        this.mineralesContenidos.add(mineral);
        actualizarClasificacion();
    }

    public void registrarSiembra(Cereal cereal) {
        this.historialSiembra.add(cereal);
    }

    private void actualizarClasificacion() {
        for (Mineral mineral : mineralesContenidos) {
            if (mineral.isEsPrimario()) {
                this.tipoLote = TipoLote.ESPECIAL; // Si encuentra al menos uno primario se clasifica como especial
                return;
            }
        }
        this.tipoLote = TipoLote.COMUN;
    }

    public int getNumeroLote() {return numeroLote;}
    public TipoLote getTipoLote() {return tipoLote;}
    public List<Mineral> getMineralesContenidos() {return mineralesContenidos;}
    public List<Cereal> getHistorialSiembra() {return historialSiembra;}
}
