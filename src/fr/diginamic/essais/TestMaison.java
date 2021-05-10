package fr.diginamic.essais;

import fr.diginamic.maison.*;

public class TestMaison {
    public static void main(String[] args) {
        Maison maison = new Maison();
        Maison maison1 = new Maison();
        WC wc = new WC(5.0, 1);
        Salon salon = new Salon(30.5, 1);
        SalleDeBain salleDeBain = new SalleDeBain(14.3,1);
        Chambre chambre = new Chambre(4.5,4);
        Chambre chambre1 = new Chambre(4.0,4);
        Chambre chambre2 = new Chambre(5.0,4);
        maison.ajouterPiece(salon);
        maison.ajouterPiece(salleDeBain);
        maison.ajouterPiece(wc);
        maison1.ajouterPiece(chambre);
        maison1.ajouterPiece(chambre1);
        maison1.ajouterPiece(chambre2);

        System.out.println(maison.superficieParEtage(1));
        System.out.println(maison1.superficieParPiece(Chambre.class));
        System.out.println(maison.superficieTotaleMaison());


    }
}
