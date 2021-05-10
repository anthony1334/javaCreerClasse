package fr.diginamic.essais;
import fr.diginamic.formes.Forme;

public class AfficheForme {
    public static void afficheForme( Forme forme) {
        System.out.println(forme + " surface :" + forme.calculerSurface() + "cm2" + " perimetre : " + forme.calculerPerimetre() + "cm ");

    }
}
