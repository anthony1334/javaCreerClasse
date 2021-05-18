package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationDepartement extends MenuService {
    public  void traiter(Recensement recensement,Scanner scanner){
        System.out.println("veuillez saisir le departement :");
        String departement = scanner.nextLine();
        System.out.println(recensement.populationDepartement(departement));
    }

}
