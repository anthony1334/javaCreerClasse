package fr.diginamic.maison;

public class SalleDeBain extends Piece{
    public SalleDeBain(double superficie, int etage) {
        super(superficie, etage);
    }

    @Override
    public String toString() {
        return "SalleDeBain{" +
                "superficie=" + superficie +
                ", etage=" + etage +
                '}';
    }
}
