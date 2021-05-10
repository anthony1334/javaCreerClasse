package fr.diginamic.entites;

import fr.diginamic.utils.CercleFactory;

public class TestCercle {
    public static void main(String[] args) {

        Cercle cercle1 =CercleFactory.fabriqueCercle(5);

        Cercle cercle = new Cercle(30);
        System.out.println("perimetre cercle : " + cercle.Perimetre());
        System.out.println("perimetre cercle1 : " + cercle1.Perimetre());
        System.out.println("surface cercle : " + cercle.Surface());
        System.out.println("surface cercle1 : " + cercle1.Surface());

    }
}
