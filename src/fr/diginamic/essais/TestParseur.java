package fr.diginamic.essais;

import fr.diginamic.parseur.Expression;
import fr.diginamic.parseur.Parseur;

public class TestParseur {
    public static void main(String[] args) {
        String chaine = "y+2";
        Expression expr = Parseur.parse(chaine);
        System.out.println("expr" +expr);
        double resultat = expr.evaluer('x',2.5);
        System.out.println(resultat);


    }
}
