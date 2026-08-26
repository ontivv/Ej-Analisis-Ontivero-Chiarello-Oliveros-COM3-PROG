package EJ04;

import EJ04.enums.Mineral;
import EJ04.enums.TipoCereal;

public class AsesorSiembra {
    public boolean aconsejar(Cereal cereal, Lote lote) {
        System.out.println("===================================================================");
        System.out.println("Analizando viabilidad de siembra...");
        System.out.println("Lote: " + lote.getNumeroLote() + " (Clasificación: " + lote.getTipoLote() + ")");
        System.out.println("Cereal a sembrar: " + cereal.getNombre() + "(Tipo: " + cereal.getTipoCereal() + ")");
        System.out.println("---------------------------------------------------------------");

        if (cereal.getTipoCereal() == TipoCereal.PASTURA) {
            for (Cereal cerealPrevio : lote.getHistorialSiembra()) {
                if (cerealPrevio.getTipoCereal() == TipoCereal.PASTURA) {
                    System.out.println("-- CONSEJO: RECHAZADO. Ya se sembró una pastura (" + cerealPrevio.getNombre() + ") previamente en este lote.");
                    System.out.println("===================================================================\n");
                    return false;
                }
            }
        }

        for (Mineral mineralRequerido : cereal.getMineralesRequeridos()) {
            if (!lote.getMineralesContenidos().contains(mineralRequerido)) {
                System.out.println("-- CONSEJO: RECHAZADO. El lote no cuenta con el mineral requerido: " + mineralRequerido);
                System.out.println("===================================================================\n");
                return false;
            }
        }

        System.out.println("-- CONSEJO: APROBADO. El lote " + lote.getNumeroLote() + " es apto para sembrar " + cereal.getNombre() + ".");
        System.out.println("===================================================================\n");
        return true;
    }
}
