package fr.diginamic.recensement;

import tri.ComparatorNom;

import java.util.*;

public class Top10Region extends  MenuService{
     public void traiter(Recensement recensement, Scanner scanner){
            List<Region> populationRegion = new ArrayList<>();
             for (Region region : recupereRegion(recensement)) {
                populationRegion.add(region);
             }
             // Tri les régions par populations
         Collections.sort(populationRegion, new ComparartorRegion()); 


        // Récupère le top 10 des régions
         ArrayList<Region> top10 = new ArrayList<>(populationRegion.subList(0,10));
         for (Region region : top10) {
             System.out.println("top10: " +region);
         }
     }

    // Recupere les regions
    private HashSet<Region> recupereRegion(Recensement recensement){
        HashSet<Region> regions = new HashSet<>();
        for (Ville ville : recensement.arrayVille) {
            if(! hasRegion(ville.codeRegion, regions)){
                Region region = new Region();
                region.code= ville.codeRegion;
                region.nom = ville.nomRegion;
                region.population = recensement.populationRegion(region.code);
                regions.add(region);

            }

        }

        System.out.println(regions.size());

        return regions;
    }


    private Boolean hasRegion(int code, HashSet <Region> regions){
        for (Region region1 : regions) {
            if(code == region1.code){
                return true;
            }
        }
        return false;
    }

}
