package fr.diginamic.salaire;

public class Pigiste extends Intervenant {
    int nbrJourTravaille;
    double salaireJour;

    public Pigiste(String nom, String prenom, int nbrJourTravaille, double salaireJour) {
       super(nom, prenom);
        this.nbrJourTravaille = nbrJourTravaille;
        this.salaireJour = salaireJour;
    }



    @Override
    public double getSalaire(){
     return nbrJourTravaille * salaireJour;

}
    @Override
    public String toString() {
        return "Pigiste{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nbrJourTravaille=" + nbrJourTravaille +
                ", salaireJour=" + salaireJour +
                '}';
    }
}
