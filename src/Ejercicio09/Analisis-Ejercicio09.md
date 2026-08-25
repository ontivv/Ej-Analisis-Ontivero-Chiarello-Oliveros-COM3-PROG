Sustantivos detectados como Clases: ObjetoArte, Pintura, Escultura, OtroObjeto, Pertenencia, Permanente, Prestamo, Artista, Origen, Exposicion, ColeccionExterna.

Sustantivos detectados como Atributos: nº de identificación, título, año de creación, descripción, tipo de pintura, soporte, estilo, material, altura, peso,
fecha de adquisición, coste, en exposición (boolean), fecha de recepción, fecha de devolución, país, cultura, época, nombre, fecha de nacimiento.
Verbos que conectan clases (Relaciones): Crear/Realizar (Artista a ObjetoArte), Exhibir (Exposición a ObjetoArte), Provenir (Préstamo a Colección Externa),
Clasificar/Tener (ObjetoArte tiene Pertenencia y Origen).

Restricciones/Reglas del negocio: Los objetos de arte tienen una doble clasificación obligatoria y paralela: por un lado según su naturaleza física (Pintura,
Escultura, Otro) y por otro según su estado legal/administrativo en el museo (Permanente o Préstamo). Los nombres de los artistas y de las colecciones externas deben ser únicos.