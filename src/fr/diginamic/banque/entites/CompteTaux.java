package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {
    private double tauxDeRemuneration;

    public CompteTaux(int numeroDeCompte, int soldeDuCompte, double tauxDeRemuneration) {
        super(numeroDeCompte, soldeDuCompte);
        this.tauxDeRemuneration = tauxDeRemuneration;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tauxDeRemuneration=" + tauxDeRemuneration +
                '}';
    }
}
