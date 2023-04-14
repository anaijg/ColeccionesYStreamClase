package ejemploMapas;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @see <a href="https://refactorizando.com/metodos-hashmap-java/#:~:text=%C2%BFQu%C3%A9%20es%20un%20HashMap%3F,y%20no%20se%20encuentra%20ordenada.">
 *     Métodos principales de HashMap
 *     </a>
 */
public class Ejemplo1 {
    public static void main(String[] args) {
        // Creamos un mapa
        // K (clave): idSocio
        // V (valor): nombre
        HashMap<Integer, String> mapa = new HashMap<>();
        // 1) Añadir elementos
        mapa.put(1, "Pepito");       
        mapa.put(2, "Juanito");       
        mapa.put(3, "Periquito");       
        mapa.put(4, "Victorito");
        // 2) Recuperar elementos: le doy la clave para que me recupere el valor
        System.out.println(mapa.get(3));
        System.out.println(mapa.get(2));
    }
}
