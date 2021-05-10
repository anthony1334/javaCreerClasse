package fr.diginamic.salaire;

public abstract class Intervenant {
    String nom, prenom;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Intervenant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    public abstract  double getSalaire();

}
