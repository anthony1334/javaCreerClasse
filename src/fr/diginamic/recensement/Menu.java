package fr.diginamic.recensement;

import java.util.Scanner;

public class Menu extends MenuService{
    public void traiter(Recensement recensement, Scanner scanner){
        int choix = 0;
        while (choix != 9){
            System.out.println(" 1: Population d\'une ville donnée \n 2: Population d\'un département donné\n 3: Population d\'une région donnée\n 4: Afficher les 10 régions les plus peuplées\n 5: Afficher les 10 départements les plus peuplés\n 6:  Afficher les 10 villes les plus peuplées d\'un département\n 7:  Afficher les 10 villes les plus peuplées d\'une région\n 8:  Afficher les 10 villes les plus peuplées de FRANCE  ");
            System.out.println("veuillez saisir votre choix:");
            try {
                choix = Integer.parseInt(scanner.nextLine());

                    switch (choix){
                        case 1 :
                            RecherchePopulationVille rechercheVille = new RecherchePopulationVille();
                            rechercheVille.traiter(recensement, scanner);
                            break;
                        case 2 :
                            RecherchePopulationDepartement recherchedepartement = new RecherchePopulationDepartement();
                            recherchedepartement.traiter(recensement, scanner);
                            break;
                        case 3 :
                            RecherchePopulationRegion rechercheRegion = new RecherchePopulationRegion();
                            rechercheRegion.traiter(recensement,scanner);
                            break;
                        case 4:
                            Top10Region top10Region = new Top10Region();
                            top10Region.traiter(recensement, scanner);
                            break;
                        case 5:
                            Top10Departement top10Departement = new Top10Departement();
                            top10Departement.traiter(recensement,scanner);
                            break;
                        case 6:
                            Top10VilleParDepartement top10VilleParDepartement = new Top10VilleParDepartement();
                            top10VilleParDepartement.traiter(recensement,scanner);
                            break;
                        case 7:
                            Top10VilleParRegion top10VilleParRegion = new Top10VilleParRegion();
                            top10VilleParRegion.traiter(recensement,scanner);
                            break;
                        case 8:
                            Top10VillesDeFrance top10VillesDeFrance = new Top10VillesDeFrance();
                            top10VillesDeFrance.traiter(recensement,scanner);
                            break;
                        case 9:
                            break;
                        default:
                            System.out.println("Veuillez entrez un nombre valid.");
                        }


                }catch (NumberFormatException e){
                e.printStackTrace();
            }
        }
    }
}
