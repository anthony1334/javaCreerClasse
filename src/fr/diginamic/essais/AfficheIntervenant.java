package fr.diginamic.essais;

import fr.diginamic.formes.Forme;
import fr.diginamic.salaire.*;

public class AfficheIntervenant {
    public static String afficheIntervenant(Intervenant intervenant) {
      return  " salaire :  " + intervenant.getSalaire();

       }
    public static String afficheDonnees(Intervenant intervenant) {
        return " l'intervenant " +intervenant + " a un salaire de " + intervenant.getSalaire();

    }

    }


