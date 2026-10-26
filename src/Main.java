public class Main {
    public static void main(String[] args) {
        Bosque bosque = new Bosque();

        // 1000 árboles, pero solo 2 tipos distintos
        for (int i = 0; i < 500; i++) {
            bosque.plantarArbol(i, i * 2, "Pino", "Verde oscuro", "textura_pino.png");
            bosque.plantarArbol(i * 3, i, "Roble", "Verde claro", "textura_roble.png");
        }

        bosque.dibujar();

        System.out.println("Árboles plantados: 1000");
        System.out.println("Objetos TipoArbol creados: " + FabricaTipoArbol.cantidadTipos());
    }
}