package fr.diginamic.entites;

public class Theatre {
    String nom;
    int capaciteMax;
   public int totalClients;
   public double recetteTotale;

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalClients = 0;
        this.recetteTotale = 0.0;

    }

    public void inscrire(int nbrClients, double prixPlace ){
        if(nbrClients + totalClients <= capaciteMax){
            totalClients = totalClients + nbrClients;
            recetteTotale = recetteTotale + prixPlace * nbrClients;

        }else{
            System.out.println("dsl la capacité maximum est atteinte");
        }


    }

    @Override
    public String toString() {
        return "Theatre{" +
                "nom='" + nom + '\'' +
                ", capaciteMax=" + capaciteMax +
                ", totalClients=" + totalClients +
                ", recetteTotale=" + recetteTotale +
                '}';
    }
}
