package EJ07;

import EJ07.enums.DificultadPista;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("INICIANDO SISTEMA DEL CAMPEONATO DE ESQUÍ\n");

        Federacion fasa = new Federacion("Federación Argentina de Ski y Andinismo", 1500);

        Estacion lasLenas = new Estacion(101, "Las Leñas", "Valle de Las Leñas, Mendoza", "0260-4471100", 65);
        lasLenas.agregarFederacionAdministradora(fasa);
        lasLenas.agregarPersonaContacto("Carlos - Jefe de Pistas");
        lasLenas.agregarPersonaContacto("María - Rescate");

        Pista venus = new Pista(1, 2, DificultadPista.VERDE);
        Pista apolo = new Pista(2, 4, DificultadPista.AZUL);
        Pista mercurio = new Pista(3, 3, DificultadPista.NEGRO);

        lasLenas.agregarPista(venus);
        lasLenas.agregarPista(apolo);
        lasLenas.agregarPista(mercurio);

        Esquiador esquiador1 = new Esquiador("SLALOM-001", "35123456", "Juan Pérez", LocalDate.of(1998, 5, 15), fasa);

        Equipo equipoAlfa = new Equipo("EQ-FONDO-09", "Marcos Entrenador");
        Esquiador esquiador2 = new Esquiador("FONDO-002", "40111222", "Lucía Gómez", LocalDate.of(2001, 10, 8), fasa);
        esquiador2.asignarEquipo(equipoAlfa); // Al hacer esto, ya no compite sola

        System.out.println("==================================================");
        System.out.println("DATOS DE LA ESTACIÓN");
        System.out.println("Nombre: " + lasLenas.getNombre()); // Tendría que existir este getter en tu clase
        System.out.println("Cantidad de pistas habilitadas: " + lasLenas.getNumeroPistas()); // Debería dar 3
        System.out.println("Contactos de emergencia: " + lasLenas.getPersonasContacto());

        System.out.println("\n==================================================");
        System.out.println("DATOS DE LOS PARTICIPANTES");

        System.out.println("Participante 1: " + esquiador1.getCodigoInscripcion());
        System.out.println("Edad calculada: " + esquiador1.getEdad() + " años");
        System.out.println("¿Compite de forma individual?: " + (esquiador1.esIndividual() ? "SÍ" : "NO"));

        System.out.println("--------------------------------------------------");
        System.out.println("Participante 2: " + esquiador2.getCodigoInscripcion());
        System.out.println("Edad calculada: " + esquiador2.getEdad() + " años");
        System.out.println("¿Compite de forma individual?: " + (esquiador2.esIndividual() ? "SÍ" : "NO"));
        System.out.println("==================================================");
    }
}