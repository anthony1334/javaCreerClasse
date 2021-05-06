package essais;

import entities.AdressePostale;

public class TestAdressePostale {


    public static void main(String...Args){
       AdressePostale adresse1 = new AdressePostale(42,"rue de la poupée qui tousse","paris",9300);


       AdressePostale addresse2 = new AdressePostale(24,"castrum","mtp",34000);

        adresse1.libelleDeRue ="truc";
        System.out.println(adresse1.libelleDeRue);

    }

}
