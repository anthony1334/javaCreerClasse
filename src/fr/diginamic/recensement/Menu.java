package fr.diginamic.recensement;

import java.util.Scanner;

public class Menu extends MenuService{
    public void traiter(Recensement recensement, Scanner scanner){
        MenuService service = null;
        int choix = 0;
        while (choix != 9){
            System.out.println(" 1: Population d\'une ville donnée \n 2: Population d\'un département donné\n 3: Population d\'une région donnée\n 4: Afficher les 10 régions les plus peuplées\n 5: Afficher les 10 départements les plus peuplés\n 6:  Afficher les 10 villes les plus peuplées d\'un département\n 7:  Afficher les 10 villes les plus peuplées d\'une région\n 8:  Afficher les 10 villes les plus peuplées de FRANCE  ");
            System.out.println("veuillez saisir votre choix:");
            try {
                choix = Integer.parseInt(scanner.nextLine());

                switch (choix){
                    case 1 :
                       service = new RecherchePopulationVille();

                        break;
                    case 2 :
                        service  = new RecherchePopulationDepartement();

                        break;
                    case 3 :
                        service = new RecherchePopulationRegion();

                        break;
                    case 4:
                        service = new Top10Region();

                        break;
                    case 5:
                        service  = new Top10Departement();

                        break;
                    case 6:
                        service  = new Top10VilleParDepartement();

                        break;
                    case 7:
                        service  = new Top10VilleParRegion();

                        break;
                    case 8:
                        service  = new Top10VillesDeFrance();
                        break;
                    case 9:
                        service = null;
                        break;
                    default:
                        System.out.println("Veuillez entrez un nombre valid.");
                    }
                    if(service != null){
                        service.traiter(recensement, scanner);
                    }


                }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
    }
}
