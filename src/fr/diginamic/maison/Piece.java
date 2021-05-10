package fr.diginamic.maison;

public abstract class Piece {
    double superficie;
    int etage;

    public Piece(double superficie, int etage) {
        if( etage < 0.0 || superficie < 0.0){
            System.out.println("Veuillez entrez une valeur positive");
        }else{
        this.superficie = superficie;
        this.etage = etage;
    }
    }
}

