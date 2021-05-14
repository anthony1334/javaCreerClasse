package fr.diginamic.essais;

import fr.diginamic.parseur.Expression;
import fr.diginamic.parseur.Parseur;

public class TestParseur {
    public static void main(String[] args) {
        String chaine = "3*x";
        Expression expr = Parseur.parse(chaine);
        System.out.println("expr" +expr);
        double resultat = expr.evaluer("x",9.0);
        System.out.println(resultat);


    }
}
