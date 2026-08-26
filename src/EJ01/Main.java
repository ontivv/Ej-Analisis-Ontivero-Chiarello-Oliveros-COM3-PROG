package EJ01;

import EJ01.DatosDeFiguras.Lado;
import EJ01.DatosDeFiguras.Punto;
import EJ01.Figuras.Circulo;
import EJ01.Figuras.Cuadrado;
import EJ01.Figuras.Rectangulo;
import EJ01.Figuras.Triangulo;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== SISTEMA DE FIGURAS GEOMÉTRICAS ===\n");

        Triangulo miTriangulo = new Triangulo();
        Rectangulo miRectangulo = new Rectangulo();
        Cuadrado miCuadrado = new Cuadrado();
        Circulo miCirculo = new Circulo(5.5); // Le pasamos el radio

        System.out.println("Construyendo el " + miRectangulo.getTipoFigura() + "...");

        // Creamos los 4 Puntos
        Punto pr1 = new Punto(0, 0);
        Punto pr2 = new Punto(5, 0);
        Punto pr3 = new Punto(5, 3);
        Punto pr4 = new Punto(0, 3);

        // Creamos los 4 Lados pasándole los puntos
        Lado ladoInfRect = new Lado(pr1, pr2);
        Lado ladoDerRect = new Lado(pr2, pr3);
        Lado ladoSupRect = new Lado(pr3, pr4);
        Lado ladoIzqRect = new Lado(pr4, pr1);

        // Agregamos los lados a la colección del Rectángulo
        miRectangulo.agregarLado(ladoInfRect);
        miRectangulo.agregarLado(ladoDerRect);
        miRectangulo.agregarLado(ladoSupRect);
        miRectangulo.agregarLado(ladoIzqRect);


        System.out.println("Construyendo el " + miTriangulo.getTipoFigura() + "...\n");

        Punto pt1 = new Punto(0, 0);
        Punto pt2 = new Punto(4, 0);
        Punto pt3 = new Punto(2, 4);

        miTriangulo.agregarLado(new Lado(pt1, pt2));
        miTriangulo.agregarLado(new Lado(pt2, pt3));
        miTriangulo.agregarLado(new Lado(pt3, pt1));


        System.out.println("=== DETALLES DE LAS FIGURAS ===");

        // Mostrar detalles del Rectángulo
        System.out.println("Figura: " + miRectangulo.getTipoFigura());
        System.out.println("Lados teóricos heredados: " + miRectangulo.getNumeroDeLados());
        System.out.println("Lados reales cargados: " + miRectangulo.getLados().size());
        System.out.println("---------------------------");

        // Mostrar detalles del Triángulo
        System.out.println("Figura: " + miTriangulo.getTipoFigura());
        System.out.println("Lados teóricos heredados: " + miTriangulo.getNumeroDeLados());
        System.out.println("Lados reales cargados: " + miTriangulo.getLados().size());
        System.out.println("---------------------------");

        // Mostrar detalles del Círculo
        System.out.println("Figura: " + miCirculo.getTipoFigura());
        System.out.println("Radio: " + miCirculo.getRadio());
        System.out.println("---------------------------");

        // Mostrar detalles del Cuadrado
        System.out.println("Figura: " + miCuadrado.getTipoFigura());
        System.out.println("Lados teóricos heredados de Cuadrilátero: " + miCuadrado.getNumeroDeLados());
        System.out.println("---------------------------");


        System.out.println("=== VALIDACIÓN DE TIPO ===");

        if (miCuadrado.getTipoFigura().equalsIgnoreCase("Cuadrado")) {
            System.out.println("Validación exitosa: El objeto " + miCuadrado.getTipoFigura() + " fue reconocido correctamente sin errores de mayúsculas/minúsculas.");
        } else {
            System.out.println("Error: El tipo de figura no coincide.");
        }
    }
}
