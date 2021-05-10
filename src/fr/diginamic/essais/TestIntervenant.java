package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.*;

public class TestIntervenant {
    public static void main(String[] args) {
       Salarie salarie = new Salarie("Durand", "paul",1700.0, "cdi");
        System.out.println(AfficheIntervenant.afficheIntervenant(salarie));
        System.out.println(AfficheIntervenant.afficheDonnees(salarie));

        Pigiste pigiste = new Pigiste("Martin", "toto " , 20, 90.5);
        System.out.println(AfficheIntervenant.afficheIntervenant(pigiste));
        System.out.println(AfficheIntervenant.afficheDonnees(pigiste));

    }
}
