package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {
    Piece[] tableauPieces = {};

    public void ajouterPiece(Piece piece){
        if(piece == null){
            System.out.println("Veuillez entrez une valeur");
        }else {
            tableauPieces = Arrays.copyOf(tableauPieces, tableauPieces.length + 1);
            tableauPieces[tableauPieces.length - 1] = piece;
        }
    }

    public String superficieTotaleMaison(){
        double superficie = 0.0;
        for (int i = 0; i < tableauPieces.length; i++) {
            superficie = superficie + tableauPieces[i].superficie;
        }
        return  " La superficie totale de la maison est de: " + superficie + " M2" ;
    }

    public String superficieParEtage(int etage){
        double superficie = 0.0;

        for (int i = 0; i < tableauPieces.length; i++) {
            if(etage  == tableauPieces[i].etage){
                superficie = superficie + tableauPieces[i].superficie;
            }

        }
        return  " La superficie par etage de la maison est de: " + superficie + " M2" ;
    }

    public String superficieParPiece(Class<?> classe ){
        double superficie = 0.0;
        for (int i = 0; i < tableauPieces.length; i++) {

            if(classe == tableauPieces[i].getClass()){
                superficie = superficie + tableauPieces[i].superficie;
            }
        }
        return  " La superficie par " + classe.getSimpleName() +" de la maison est de: " + superficie + " M2";
    }

}
