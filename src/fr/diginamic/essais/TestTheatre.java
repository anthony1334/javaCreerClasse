package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Jean luc le magnifique",5);
        theatre.inscrire(3,12.0);
        System.out.println("recette totale: " + theatre.recetteTotale + " " + theatre.totalClients);
        theatre.inscrire(2,15.0);
        System.out.println("recette totale: " + theatre.recetteTotale + " " + theatre.totalClients);
        theatre.inscrire(1,15.0);
        System.out.println("recette totale: " + theatre.recetteTotale + " " + theatre.totalClients);

    }
}
