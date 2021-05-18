package fr.diginamic.recensement;

public class Region {
    String nom;
    int code , population;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Region{" +
                "nom='" + nom + '\'' +
                ", code=" + code +
                ", population=" + population +
                '}';
    }
}
