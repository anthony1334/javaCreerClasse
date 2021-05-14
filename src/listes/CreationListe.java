package listes;

import java.util.ArrayList;

public class CreationListe {
    public static void main(String[] args) {
      ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add("i");

        }
        System.out.println(arrayList.size());
    }

}
