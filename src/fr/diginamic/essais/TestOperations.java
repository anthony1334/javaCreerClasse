package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {
        Operations operations = new Operations();
        System.out.println("Operation " + operations.calcul(2.5,'+',4.5));
        System.out.println("Soustraction " + operations.calcul(2.5,'-',4.5));
        System.out.println("Division " + operations.calcul(2.5,'/',4.5));
        System.out.println("Multiplication " +operations.calcul(2.5,'*',4.5));



    }
}
