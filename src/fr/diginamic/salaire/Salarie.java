package fr.diginamic.salaire;

public class Salarie extends Intervenant{

    public double montantSalaire;
    private String contrat;

    public Salarie(String nom, String prenom, double montantSalaire, String contrat) {
        super(nom, prenom);
        this.montantSalaire = montantSalaire;
        this.contrat = contrat;
    }
    @Override

    public double getSalaire(){
        return  this.montantSalaire;
    }

    @Override
    public String toString() {
        return "Salarie{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", montantSalaire=" + montantSalaire +
                ", contrat='" + contrat + '\'' +
                '}';
    }



}
