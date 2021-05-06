package essais;

import entities.AdressePostale;
import entities.Personne;


public class TestPersonne {
    public static void main(String[]args){
    Personne personne = new Personne("Martin","john");
        AdressePostale adresse1 = new AdressePostale(42,"rue de la poupée qui tousse","paris",9300);
    Personne personne2 = new Personne("Martin","john",adresse1);
        System.out.println(personne.getNom());
       personne.modifyPrenom(" marc");
        System.out.println(personne.getPrenom());

        System.out.println(personne.getNom());

}

        }


