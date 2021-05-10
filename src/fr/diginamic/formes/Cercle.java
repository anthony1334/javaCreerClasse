package fr.diginamic.formes;

public class Cercle extends Forme{
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }
@Override
    public double calculerSurface(){
        return 2 *Math.PI * rayon;
    }
@Override
    public double calculerPerimetre(){
        return  (Math.PI * rayon)* (Math.PI * rayon);
    }

    @Override
    public String toString() {
        return "Cercle{" +
                "rayon=" + rayon +
                '}';
    }
}
