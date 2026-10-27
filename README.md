# Patrón Flyweight: bosque de árboles

## Autores

- Mateo Enrique Urango Morales - 20241020117
- Cristian Esteban Castañeda Vargas - 20241020094
- Santiago Nicolás Triana Mariño - 20241020115

## Descripción

Ejemplo en Java del patrón de diseño **Flyweight** (peso ligero). El programa representa un bosque con muchos árboles, compartiendo los datos comunes de cada tipo para evitar crear un objeto de tipo por cada árbol.

## Cómo funciona

- `TipoArbol` contiene el estado intrínseco compartido: nombre, color y textura.
- `FabricaTipoArbol` reutiliza las instancias de `TipoArbol` mediante una caché.
- `Arbol` conserva la posición `(x, y)` como estado extrínseco y la pasa al tipo compartido al dibujarse.
- `Bosque` crea y dibuja los árboles.
- `Main` planta 1.000 árboles de dos tipos distintos y muestra cuántos objetos `TipoArbol` se crearon.

## Requisitos

- JDK instalado y disponible en el `PATH` (`javac` y `java`).

## Compilar y ejecutar

Desde la raíz del proyecto:

```powershell
New-Item -ItemType Directory -Force out
javac -d out src\*.java
java -cp out Main
```

La ejecución dibuja los 1.000 árboles en la consola. Al final, el número de objetos `TipoArbol` creados debe ser `2`, aunque haya 1.000 árboles plantados.
