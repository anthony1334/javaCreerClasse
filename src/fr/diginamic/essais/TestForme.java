package fr.diginamic.essais;

import fr.diginamic.formes.*;

public class TestForme {
    public static void main(String[] args) {
        Forme cercle = new Cercle(3.0);
        Forme rectangle = new Rectangle(4.0,2.5);
        Forme carre = new Carre(6.0);
        AfficheForme.afficheForme(cercle);
        AfficheForme.afficheForme(rectangle);
        AfficheForme.afficheForme(carre);
    }
}
