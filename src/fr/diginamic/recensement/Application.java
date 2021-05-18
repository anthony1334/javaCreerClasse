package fr.diginamic.recensement;

import tri.ComparatorNom;

import java.util.Collections;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Recensement recensement = new Recensement();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.traiter(recensement,scanner);

    }
}
