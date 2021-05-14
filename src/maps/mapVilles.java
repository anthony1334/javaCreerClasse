package maps;

import listes.Ville;
import tri.ComparatorHabitant;
import tri.ComparatorNom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class mapVilles {


    public static void main(String[] args) {
        /*
        HashMap<Integer, String> mapVilles = new HashMap<>();
        mapVilles.put(13, "Marseille");
        mapVilles.put(34, "Montpellier");
        mapVilles.put(44, "Nantes");
        mapVilles.put(75, "Paris");
        mapVilles.put(31, "Toulouse");
        mapVilles.put(32, "Lille");
        mapVilles.put(33, "Lyon");
        mapVilles.put(35, "Bordeaux");/*
//Affiche les clés
       /* for (Integer integer : mapVilles.keySet()) {
            System.out.println(integer);
        }

        //Affiche les valeurs
        for (String value : mapVilles.values()) {
            System.out.println(value);
        }*/

        //Stock les instances de villes
        ArrayList<Ville> tableauVille = new ArrayList<>();

        tableauVille.add(new listes.Ville("Nice",343000));
        tableauVille.add(new listes.Ville("Carcassonne",47800));
        tableauVille.add(new listes.Ville("Narbonne",53400));
        tableauVille.add(new listes.Ville("Lyon",484000));
        tableauVille.add(new listes.Ville("Foix",9700));
        tableauVille.add(new listes.Ville("Pau",77200));
        tableauVille.add(new listes.Ville("Marseille",850700));
        tableauVille.add(new listes.Ville("Tarbes",40600));


        HashMap<String,Ville> hashMap = new HashMap<>();


        for (int i = 0; i < tableauVille.size(); i++) {
            hashMap.put(tableauVille.get(i).getNom(),tableauVille.get(i));
        }

        Map.Entry<String, Ville> villeMoinsPeuplee= hashMap.entrySet().stream().findFirst().get(); ;
        for (Map.Entry<String, Ville> stringVilleEntry : hashMap.entrySet()) {
            if( stringVilleEntry.getValue().getNbrHabitants() < villeMoinsPeuplee.getValue().getNbrHabitants()){
                 villeMoinsPeuplee = stringVilleEntry ;
            }

        }
        hashMap.remove(villeMoinsPeuplee.getKey());







       /* hashMap.putAll(tableauVille);
        for (Ville value : hashMap.values()) {
            System.out.println(value);
        }*/
    }
}
