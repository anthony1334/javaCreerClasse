package fr.diginamic.operations;

public class TestMoyenne {
    public static void main(String[] args) {
        CalculMoyenne calculMoyenne = new CalculMoyenne();
        calculMoyenne.ajout(5.4);
        calculMoyenne.ajout(6.4);
        calculMoyenne.ajout(10.2);

        System.out.println("moyenne " + calculMoyenne.calcul());

        CalculMoyenne calculMoyenne1 = new CalculMoyenne();
        calculMoyenne1.ajout(93.5);
        calculMoyenne1.ajout(5.4);
        calculMoyenne1.ajout(36.4);
        calculMoyenne1.ajout(44.7);
        calculMoyenne1.ajout(69.7);
        calculMoyenne1.ajout(4.0);
        System.out.println("moyenne 1 " + calculMoyenne1.calcul());




    }

}
