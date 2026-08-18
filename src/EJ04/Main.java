package EJ04;

import EJ04.enums.Mineral;
import EJ04.enums.NombreCereal;

public class Main {
    public static void main(String[] args) {

        AsesorSiembra asesorSiembra = new AsesorSiembra();

        Lote lote1 = new Lote(1);
        lote1.agregarMineral(Mineral.NITROGENO);
        lote1.agregarMineral(Mineral.POTASIO);
        lote1.agregarMineral(Mineral.FOSFORO);

        Cereal cereal1 = new Cereal(NombreCereal.ALFALFA);
        cereal1.agregarMineralRequerido(Mineral.NITROGENO);
        cereal1.agregarMineralRequerido(Mineral.POTASIO);
        cereal1.agregarMineralRequerido(Mineral.FOSFORO);

        if (asesorSiembra.aconsejar(cereal1, lote1)) { lote1.registrarSiembra(cereal1); }

        System.out.println("------------ FORZAMOS EL ERROR AHORA ------------");

        Cereal cereal2 = new Cereal(NombreCereal.TREBOL_SUBTERRANEO);
        cereal2.agregarMineralRequerido(Mineral.NITROGENO);
        cereal2.agregarMineralRequerido(Mineral.POTASIO);
        cereal2.agregarMineralRequerido(Mineral.FOSFORO);

        asesorSiembra.aconsejar(cereal2, lote1);
    }
}
