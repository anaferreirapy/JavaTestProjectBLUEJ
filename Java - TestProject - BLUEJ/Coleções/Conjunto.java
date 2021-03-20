








//Classe Collection = Interface (Filhas da collection -> List e interface Set).
/* Set - Cleçao de elementos unicos -> LinkedSet, TreeSet e HashSet.
 * List (Coleçoes Livres) -> ArrayList, LinkedList e Vector.
 * Map - Elemento associado a uma chave -> LinkedHashMap, Hashtable, HashMap e TreeMap.

FiFo (Fila de elementos.) - LiFo -> (Pilha de elementos).

GENERICS, COLLECTIONS
Em generics length eh size.
*/
import java.util.*;

public class Conjunto {
    
    public static void main(String [] args) {
        new Conjunto().exemplificar();
    }
    
    public void exemplificar() {
        String [] frutArr = new String[4];
        
        List<String> frutas = new ArrayList<String>();
        frutas.add("Melancia");
        frutas.add("banana");
        frutas.add("MOrango");
        frutas.add("Mamao");
        
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println(frutas.get(i));
        }
        for (String f : frutas) {
            System.out.println(f);
        }
        
        
    }
}
