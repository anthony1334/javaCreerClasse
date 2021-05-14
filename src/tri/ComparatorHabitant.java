package tri;


import java.util.Comparator;
import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {
    @Override
    public int compare(Ville o1, Ville o2) {
        int result = o1.getNbrHabitants() - o2.getNbrHabitants();
        return result;
    }
}
