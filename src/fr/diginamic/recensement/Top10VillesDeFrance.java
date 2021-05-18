package fr.diginamic.recensement;

import java.util.Scanner;

public class Top10VillesDeFrance extends MenuService {
    public void traiter(Recensement recensement,Scanner scanner){
        System.out.println(recensement.populationParVilleDeFrance());
    }
}

