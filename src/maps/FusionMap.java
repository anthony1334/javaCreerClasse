package maps;

import java.util.HashMap;

public class FusionMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "Rouge");
        map1.put(2, "Vert");
        map1.put(3, "Orange");
// Création map2
        HashMap<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(4, "Blanc");
        map2.put(5, "Bleu");
        map2.put(6, "Orange");
// Ajoute map1 et map2 dans map3
        HashMap<Integer, String>  map3 = new HashMap<>();
        map3.putAll(map1);
        map3.putAll(map2);
        for (Object value : map3.values()) {
            System.out.println(value);
        }
    }
}
