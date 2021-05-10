package fr.diginamic.chaines;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args) {
        //1) Utilisez la méthode charAt(int index) pour afficher le premier caractère de la chaine de
        //caractères.
        String chaine = "Durand;Marcel;2 523.5";
        char premierCaractere = chaine.charAt(0);

        //2) Utilisez la méthode length() pour afficher la longueur de la chaine de caractères
        int longueurChaine = chaine.length();

        //3) Utilisez la méthode indexOf(char c) pour afficher l’index du premier « ; » contenu dans
        //la chaine de caractères.
        int indexCaractere = chaine.indexOf('c');

        //4) La méthode substring(int start, int end) permet d’extraire une portion de chaine de
        //caractères comprise entre un index de début (inclus) et un index de fin (exclu).
        String portion = chaine.substring(0,6);
        int indexPortionStart = chaine.indexOf('D');
        int indexPortionEnd = chaine.indexOf(';');
        String indexPortion = chaine.substring(indexPortionStart,indexPortionEnd);

        //5) Utilisez la méthode toUpperCase() pour afficher le nom de famille en majuscules.
        String majuscule = chaine.substring(indexPortionStart,indexPortionEnd).toUpperCase();

        //6) Utilisez la méthode toLowerCase() pour afficher le nom de famille en majuscules.
        String minuscule = chaine.substring(indexPortionStart,indexPortionEnd).toLowerCase();
        //7) Utilisez la méthode split pour découper la chaine de caractères en morceaux. La
        //méthode Le séparateur est le caractère « ; ». Cette méthode retourne un tableau.
        //Affichez le tableau ainsi obtenu.

        String[] leSeparateur = chaine.split(";");
        for (int i = 0; i < leSeparateur.length; i++) {
            System.out.println(" le separateur :" + leSeparateur[i]);
        }





        System.out.println("portion: " + portion);
        System.out.println("index portion: " + indexPortion);
        System.out.println("Premier caractère: " + premierCaractere);
        System.out.println("Longueur chaine: " + longueurChaine);
        System.out.println("index charactere: " + indexCaractere);
        System.out.println("nom de famille en majuscule: " + majuscule);
        System.out.println("nom de famille en minuscule: " + minuscule);


//9) A partir des 3 morceaux de chaine de caractères précédents, créez une instance de
//Salarie :
//a. Consigne : le nombre « 2 523.5» contient un espace qu’il ne faut pas
//supprimer manuellement mais de manière informatique en utilisant la
//méthode replace(String, String) de la classe String
//b. Astuce : pour transformer une chaine de caractères en double, utilisez la
//méthode static de la classe Double : Double.parseDouble(String)

        String noSpaceStr = leSeparateur[2].replaceAll(" ","");
        System.out.println("pas d\'espace " + noSpaceStr);



        Salarie salarie = new Salarie(leSeparateur[0], leSeparateur[1], Double.parseDouble(noSpaceStr));


        System.out.println(" le salarie " + salarie);



    }

}
