package tri;

import listes.Ville;

import java.util.*;

public class TestVille {
    public static void main(String[] args) {
        ArrayList<listes.Ville> tableauVille = new ArrayList<>();

        tableauVille.add(new listes.Ville("Nice",343000));
        tableauVille.add(new listes.Ville("Carcassonne",47800));
        tableauVille.add(new listes.Ville("Narbonne",53400));
        tableauVille.add(new listes.Ville("Lyon",484000));
        tableauVille.add(new listes.Ville("Foix",9700));
        tableauVille.add(new listes.Ville("Pau",77200));
        tableauVille.add(new listes.Ville("Marseille",850700));
        tableauVille.add(new listes.Ville("Tarbes",40600));

        Collections.sort(tableauVille);
        for (Ville ville : tableauVille) {
            System.out.println(ville.getNom());
        };
        Collections.sort(tableauVille,new ComparatorNom());
        Collections.sort(tableauVille,new ComparatorHabitant());








    }
}
