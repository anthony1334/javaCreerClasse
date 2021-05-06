package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte(1234,3000);
        Compte compte2 = new Compte(2345,4000);
        CompteTaux compte3 = new CompteTaux(6666,6000, 3.5);
        System.out.println(compte2);
        System.out.println(compte3);
        compte.Affiche();
        String chaine = compte.toString();
        System.out.println(chaine);
        Compte[] compteTableau = new Compte[2];
        compteTableau[0] = compte;
        compteTableau[1] = compte3;
        for (int i = 0; i < compteTableau.length; i++) {
            System.out.println(" voici le compte " + i + " " + compteTableau[i]);

        }

    }
}
