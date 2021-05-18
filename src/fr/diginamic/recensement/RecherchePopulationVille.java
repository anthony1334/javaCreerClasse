package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationVille extends MenuService{
    public  void traiter(Recensement recensement, Scanner scanner){
        System.out.println("veuillez saisir la ville :");
        String ville = scanner.nextLine();
        System.out.println(recensement.populationVille(ville));
    }

}
