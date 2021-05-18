package fr.diginamic.recensement;

import java.util.Scanner;

public class Top10VilleParRegion {
    public void traiter(Recensement recensement,Scanner scanner){
        System.out.println("veuillez saisir une region :");
        try {
            int region = Integer.parseInt(scanner.nextLine());
            System.out.println(recensement.populationVilleParRegion(region));
        }
        catch (NumberFormatException e){
            e.printStackTrace();
        }

    }
}
