package fr.diginamic.entites;

import java.util.Arrays;

public class TheatrePro {
    String  nom;
    public Spectacle[] tableauSpectacles = {};

    public TheatrePro(String nom, Spectacle[] tableauSpectacles) {
        this.nom = nom;
        this.tableauSpectacles = tableauSpectacles;
    }

    public void ajouterSpectacle(Spectacle spectacle){

            tableauSpectacles = Arrays.copyOf(tableauSpectacles,tableauSpectacles.length+1);
            tableauSpectacles[tableauSpectacles.length-1] = spectacle;
   }

    public Spectacle getSpectacle(String  nomSpectacle ){
        for (int i = 0; i < tableauSpectacles.length; i++) {
            System.out.println(nomSpectacle);
            if( nomSpectacle.equals(tableauSpectacles[i].nomSpectacle) ){
                return tableauSpectacles[i];
            }
        }
        return null;

    }
     public void inscrire(int nbrClients, String nomSpectacle){
        Spectacle spectacle = this.getSpectacle(nomSpectacle);

             if( spectacle != null) {
                 spectacle.nbrInscrits = spectacle.nbrInscrits + nbrClients;

             }

     }


    @Override
    public String toString() {
        return "TheatrePro{" +
                "nom='" + nom + '\'' +
                ", tableauSpectacles=" + Arrays.toString(tableauSpectacles) +
                '}';
    }
}

