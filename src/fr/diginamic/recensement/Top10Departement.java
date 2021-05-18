package fr.diginamic.recensement;

import tri.ComparatorNom;

import java.util.*;
//Tableau des départements
public class Top10Departement extends  MenuService{
    public void traiter(Recensement recensement, Scanner scanner){
        List<Departement> populationDepartement = new ArrayList<>();
        for (Departement departement : recupereDepartement(recensement)) {
            populationDepartement.add(departement);
        }
        // Tri les departements par populations
        Collections.sort(populationDepartement, new ComparartorDepartement());


        // Récupère le top 10 des departements
        ArrayList<Departement> top10 = new ArrayList<>(populationDepartement.subList(0,10));
        for (Departement departement : top10) {
            System.out.println("top10: " +departement);
        }
    }

    // Recupere les departements
    private HashSet<Departement> recupereDepartement(Recensement recensement){
        HashSet<Departement> departements = new HashSet<>();
        for (Ville ville : recensement.arrayVille) {
            if(! hasDepartement(ville.codeDepartement, departements)){
                Departement departement = new Departement();
                departement.code= ville.codeDepartement;

                departement.population = recensement.populationDepartement(departement.code);
                departements.add(departement);

            }

        }

        System.out.println("departement taille"+departements.size());

        return departements;
    }


    private Boolean hasDepartement(String code, HashSet<Departement> departements){
        for (Departement departement1 :  departements) {
            if(code.equals(departement1.code)) {
                return true;
            }
        }
        return false;
    }

}
