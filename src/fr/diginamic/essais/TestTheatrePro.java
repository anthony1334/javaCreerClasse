package fr.diginamic.essais;

import fr.diginamic.entites.Spectacle;
import fr.diginamic.entites.TheatrePro;
import fr.diginamic.utils.SpectacleFactory;

public class TestTheatrePro {
    public static void main(String[] args) {
        Spectacle[] spectacles ={};

        TheatrePro theatrePro = new TheatrePro("Le magnifique",spectacles);
        theatrePro.ajouterSpectacle(new Spectacle("nouveau spectacle","humour", 12.0, 5));
        System.out.println(theatrePro.tableauSpectacles);
        theatrePro.inscrire(30,"tutu");




      Spectacle spectacle =   theatrePro.getSpectacle("Le magnifique");
        System.out.println(spectacle);



    }

}
