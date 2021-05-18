package fr.diginamic.recensement;

import java.util.Comparator;

public class ComparartorDepartement implements Comparator<Departement> {


    @Override
    public int compare(Departement o1, Departement o2) {
        int result =  o2.population -o1 .population ;

        return result;
    }
}
