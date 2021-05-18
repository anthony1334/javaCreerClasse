package fr.diginamic.recensement;

import java.util.Scanner;

public class RecherchePopulationRegion extends MenuService {
    public  void traiter(Recensement recensement, Scanner scanner){
        System.out.println("veuillez saisir la région:");
        try {
            int region = Integer.parseInt(scanner.nextLine());
            System.out.println(recensement.populationRegion(region));
        }catch (NumberFormatException e){
            e.printStackTrace();
        }


    }
}
