package fr.diginamic.recensement;

import java.util.Comparator;

public class CompratorVille implements Comparator<Ville> {
    @Override
    public int compare(Ville o1, Ville o2) {
        int result = o2.populationTotale- o1.populationTotale;
        return result;
    }
}
