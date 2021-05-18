package fr.diginamic.recensement;

import tri.ComparatorNom;

import java.util.*;
//Tableau des départements
public class Top10VilleParDepartement extends  MenuService{
    public void traiter(Recensement recensement, Scanner scanner){
        System.out.println("veuillez saisir un departement :");
        String departement = scanner.nextLine();
        System.out.println(recensement.populationVilleParDepartement(departement));
    }

}
