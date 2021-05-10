package fr.diginamic.maison;

public class Salon extends Piece{
    public Salon(double superficie, int etage) {
        super(superficie, etage);
    }

    @Override
    public String toString() {
        return "Salon{" +
                "superficie=" + superficie +
                ", etage=" + etage +
                '}';
    }
}
