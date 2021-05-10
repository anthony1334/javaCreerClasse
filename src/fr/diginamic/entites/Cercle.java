package fr.diginamic.entites;

import java.util.FormatterClosedException;

public class Cercle  {
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double Surface() {
        return  Math.PI*Math.pow(rayon,2.0);
    }

    public double Perimetre() {
        return  Math.PI* (rayon * Math.pow(rayon,2.0));
    }




}
