package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;
import fr.diginamic.entites.Spectacle;

public class SpectacleFactory {
    public static Spectacle fabriqueSpectacle(String nomSpectacle, String typeSpectacle, double tarifUnitaire, int nbrInscrits){

        return new Spectacle(nomSpectacle,typeSpectacle,tarifUnitaire,nbrInscrits);
    }
}
