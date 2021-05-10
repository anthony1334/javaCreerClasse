package fr.diginamic.entites;

public class Spectacle {
    public String nomSpectacle;
    public  String typeSpectacle;
    public double tarifUnitaire;
    public int nbrInscrits;

    @Override
    public String toString() {
        return "Spectacle{" +
                "nomSpectacle='" + nomSpectacle + '\'' +
                ", typeSpectacle='" + typeSpectacle + '\'' +
                ", tarifUnitaire=" + tarifUnitaire +
                ", nbrInscrits=" + nbrInscrits +
                '}';
    }

    public Spectacle(String nomSpectacle, String typeSpectacle, double tarifUnitaire, int nbrInscrits) {
        this.nomSpectacle = nomSpectacle;
        this.typeSpectacle = typeSpectacle;
        this.tarifUnitaire = tarifUnitaire;
        this.nbrInscrits = nbrInscrits;
    }
}
