public class TipoArbol {
    private final String nombre;
    private final String color;
    private final String textura;

    public TipoArbol(String nombre, String color, String textura) {
        this.nombre = nombre;
        this.color = color;
        this.textura = textura;
    }

    // x e y son el estado extrínseco: lo recibe el flyweight, no lo guarda
    public void dibujar(int x, int y) {
        System.out.println("Dibujando " + nombre + " (" + color + ", " + textura
                + ") en (" + x + ", " + y + ")");
    }
}