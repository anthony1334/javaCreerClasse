package fr.diginamic.banque.entites;

public class Compte {
    private int numeroDeCompte;
    private  int soldeDuCompte;

    public Compte(int numeroDeCompte, int soldeDuCompte) {
        this.numeroDeCompte = numeroDeCompte;
        this.soldeDuCompte = soldeDuCompte;
    }

    public int getNumeroDeCompte() {
        return numeroDeCompte;
    }

    public int getSoldeDuCompte() {
        return soldeDuCompte;
    }

    public void setNumeroDeCompte(int numeroDeCompte) {
        this.numeroDeCompte = numeroDeCompte;
    }

    public void setSoldeDuCompte(int soldeDuCompte) {
        this.soldeDuCompte = soldeDuCompte;
    }

    public void Affiche(){
        System.out.println("numero de compte :" + numeroDeCompte + " solde du compte : " + soldeDuCompte);
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numeroDeCompte=" + numeroDeCompte +
                ", soldeDuCompte=" + soldeDuCompte +
                '}';
    }
}
