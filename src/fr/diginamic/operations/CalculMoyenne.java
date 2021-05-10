package fr.diginamic.operations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CalculMoyenne {
    double[] tableau={} ;
    List listTableau = new ArrayList<Double>();
    double somme = 0;


    public void ajout(double a){
        tableau = Arrays.copyOf(tableau,tableau.length+1);
        tableau[tableau.length-1] = a;
    }
    public void ajoutListe(double a){
        this.listTableau.add(a);
    }

    public double calcul(){
        for (int i = 0; i < tableau.length; i++) {
            somme = somme +tableau[i];
        }
        return somme/tableau.length;
    }
}
