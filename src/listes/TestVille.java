package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestVille {
    public static void main(String[] args) {
        ArrayList<Ville> tableauVille = new ArrayList<>();

        tableauVille.add(new Ville("Nice",343000));
        tableauVille.add(new Ville("Carcassonne",47800));
        tableauVille.add(new Ville("Narbonne",53400));
        tableauVille.add(new Ville("Lyon",484000));
        tableauVille.add(new Ville("Foix",9700));
        tableauVille.add(new Ville("Pau",77200));
        tableauVille.add(new Ville("Marseille",850700));
        tableauVille.add(new Ville("Tarbes",40600));






     Ville  villeLaPlusPeuplees = tableauVille.get(0);
        for (int i = 0; i < tableauVille.size(); i++) {
            if( tableauVille.get(i).nbrHabitants > villeLaPlusPeuplees.nbrHabitants){
                villeLaPlusPeuplees = tableauVille.get(i);
            }
        }
        System.out.println("la ville la plus peuplées  est " + villeLaPlusPeuplees.nom
        );

    }
}
