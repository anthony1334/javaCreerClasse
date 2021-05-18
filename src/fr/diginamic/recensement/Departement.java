package fr.diginamic.recensement;

public class Departement {
    String code;
    int  population;

    @Override
    public String toString() {
        return "Departement{" +
                "code='" + code + '\'' +
                ", population=" + population +
                '}';
    }
}
