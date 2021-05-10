package fr.diginamic.banque.entites;

public class Cercle implements ObjetGeometrique{
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return Math.PI   * rayon * 2;
    }

    @Override
    public double surface() {
        return Math.PI * rayon;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
