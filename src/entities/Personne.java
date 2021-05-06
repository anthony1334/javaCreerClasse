package entities;

public class Personne {
    public String nom, prenom ;
    public AdressePostale adressePostale;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, AdressePostale adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
    }
   public String  getNom(){
        return nom.toUpperCase();
    }


    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdressePostale() {
        return adressePostale;
    }


    public void modifyPrenom(String prenom) {
         this.prenom = prenom ;
    }

}
