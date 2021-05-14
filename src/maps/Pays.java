package maps;

public class Pays {
   private String nom,continent;
   private long nbrHabitant;

    public Pays(String nom, String continent, long nbrHabitant) {
        this.nom = nom;
        this.continent = continent;
        this.nbrHabitant = nbrHabitant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public long getNbrHabitant() {
        return nbrHabitant;
    }

    public void setNbrHabitant(long nbrHabitant) {
        this.nbrHabitant = nbrHabitant;
    }

    @Override
    public String toString() {
        return "Pays{" +
                "nom='" + nom + '\'' +
                ", continent='" + continent + '\'' +
                ", nbrHabitant=" + nbrHabitant +
                '}';
    }
}
