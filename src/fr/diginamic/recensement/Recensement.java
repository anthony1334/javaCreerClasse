package fr.diginamic.recensement;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recensement {

    ArrayList<Ville> arrayVille = new ArrayList<>();
    Path path = Paths.get("./recensement.csv");
    List<String> lines =null;

    {
        try {
            lines = Files.readAllLines(path);
            lines.remove(0);

            for (String line : lines) {
                arrayVille.add(new Ville().setData(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int populationVille(String ville){
        for (Ville ville1 : arrayVille) {
            if(ville.equals(ville1.nomCommune)){
            return ville1.populationTotale;
            }
        }
        return 0;
    }

    /**
     * recupere la population pour un  departement donné en paramètre
     * @param departement
     * @return
     */
    public int populationDepartement(String departement){
        int total = 0;
        for (Ville ville1 : arrayVille) {
            if(departement.equals(ville1.codeDepartement)){
                 total += ville1.populationTotale;
            }

        }
        return total;
    }
    //Recupere les 10 villes les plus peuplées en fonction d'un departement
    public ArrayList<Ville> populationVilleParDepartement(String departement){
       ArrayList<Ville>arrayList = new ArrayList<>();
        for (Ville ville1 : arrayVille) {
            if(departement.equals(ville1.codeDepartement)){
               arrayList.add(ville1)  ;
            }
        }
        Collections.sort(arrayList, new CompratorVille());
        ArrayList<Ville> top10 = new ArrayList<>(arrayList.subList(0,10));
        for (Ville ville : top10) {
            System.out.println("top10 des Ville par departements:"+ville.nomCommune);
        }
        return top10;

    }
//Recupere les 10 villes les plus peuplées en fonction d'une région
    public ArrayList<Ville> populationVilleParRegion(int region){
        ArrayList<Ville>arrayList = new ArrayList<>();
        for (Ville ville1 : arrayVille) {
            if(region == ville1.codeRegion){
                arrayList.add(ville1)  ;

            }
        }
        Collections.sort(arrayList, new CompratorVille());
        ArrayList<Ville> top10 = new ArrayList<>(arrayList.subList(0,10));
        for (Ville ville : top10) {
            System.out.println("top10 des Ville pour la région region:"+region + "sont: " + ville.nomCommune);
        }
        return top10;
    }

    //Recupere les 10 villes les plus peuplées de France
    public ArrayList<Ville> populationParVilleDeFrance(){
        ArrayList<Ville>arrayList = new ArrayList<>();
        for (Ville ville1 : arrayVille) {
            arrayList.add(ville1) ;
        }
        Collections.sort(arrayList, new CompratorVille());
        ArrayList<Ville> top10 = new ArrayList<>(arrayList.subList(0,10));
        for (Ville ville : top10) {
            System.out.println("top10 des Villes de France sont: " + ville.nomCommune);
        }
        return top10;

    }


    /**
     * recupere le nombre d'habitant pour une region donnée en paramètre
     * @param region
     * @return
     */
    public int populationRegion(int region){
        int total = 0;
        for (Ville ville1 : arrayVille) {
            if(region == ville1.codeRegion){
                total += ville1.populationTotale;
            }
        }
        return total;
    }


    @Override
    public String toString() {
        return "Recensement{" +
                "arrayVille=" + arrayVille +
                ", path=" + path +
                ", lines=" + lines +
                '}';
    }
}
