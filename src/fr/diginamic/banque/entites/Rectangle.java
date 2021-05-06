package fr.diginamic.banque.entites;

public class Rectangle implements ObjetGeometrique{
    double longueur;
    double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return (longueur + largeur)*2;
    }

    @Override
    public double surface() {
        return largeur * largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                '}';
    }
}
