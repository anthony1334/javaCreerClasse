package listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FusionListe {
    public static void main(String args[]) {
        List<String> liste1 = new ArrayList<String>();
        liste1.add("Rouge");
        liste1.add("Vert");
        liste1.add("Orange");

        List<String> liste2 = new ArrayList<String>();
        liste2.add("Blanc");
        liste2.add("Bleu");
        liste2.add("Orange");
//TODO Développements à réaliser ci-dessous

        List<String> liste3 = new ArrayList<>();
        Iterator<String> iterator1 = liste1.iterator();
        Iterator<String> iterator2 = liste2.iterator();

        while (iterator1.hasNext()){
            String myListe1 = iterator1.next();
           liste3.add(String.valueOf(myListe1));
        }
        while (iterator2.hasNext()){
            String myListe2 = iterator2.next();
            liste3.add(String.valueOf(myListe2));
        }

        for (String s : liste3) {
            System.out.println("liste 3: " + s);
        }
        System.out.println("longuer de liste 3:"+liste3.size());





    }

}
