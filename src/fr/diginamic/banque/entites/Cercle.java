package fr.diginamic.banque.entites;

public class Cercle implements ObjetGeometrique{
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 3.14 * rayon * 2;
    }

    @Override
    public double surface() {
        return 3.14 * rayon;
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
