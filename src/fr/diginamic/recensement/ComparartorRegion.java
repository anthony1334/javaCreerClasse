package fr.diginamic.recensement;

import listes.Ville;

import java.util.Comparator;

public class ComparartorRegion implements Comparator<Region> {
    @Override
    public int compare(Region o1, Region o2) {
        int result =  o2.population -o1 .population ;
        return result;
    }
}
