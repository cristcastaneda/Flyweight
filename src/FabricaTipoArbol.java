import java.util.HashMap;
import java.util.Map;

public class FabricaTipoArbol {
    private static final Map<String, TipoArbol> tipos = new HashMap<>();

    public static TipoArbol obtenerTipo(String nombre, String color, String textura) {
        String clave = nombre + "-" + color + "-" + textura;
        TipoArbol tipo = tipos.get(clave);

        if (tipo == null) {
            tipo = new TipoArbol(nombre, color, textura);
            tipos.put(clave, tipo);
            System.out.println("Creando nuevo tipo: " + clave);
        }
        return tipo;
    }

    public static int cantidadTipos() {
        return tipos.size();
    }
}