package fr.diginamic.recensement;

public class Ville {
    int codeRegion;
    String nomRegion;
    String codeDepartement;
    int codeCommune;
    String nomCommune;
    int populationTotale;

    public Ville setData(String data) {
        String[] ligne = data.split(";");
        this.codeRegion = Integer.parseInt(ligne[0]);
        this.nomRegion = ligne[1];
        this.codeDepartement = ligne[2];
        this.codeCommune = Integer.parseInt(ligne[5]);
        this.nomCommune = ligne[6];
        ligne[9]=ligne[9].trim().replaceAll(" ", "");
        this.populationTotale = Integer.parseInt(ligne[9]);
        return this;

    }

    public void returnVille(String param){
        if(this.nomCommune == param){
            System.out.println(this.populationTotale);
        }
    }


        public String getData(){
            return this.codeRegion +";" +  this.nomRegion +";"+ this.codeDepartement  +";" + this.codeCommune +";" +this.nomCommune +";" +  this.populationTotale;


        }

    @Override
    public String toString() {
        return "Ville{" +
                "codeRegion=" + codeRegion +
                ", nomRegion='" + nomRegion + '\'' +
                ", codeDepartement=" + codeDepartement +
                ", codeCommune=" + codeCommune +
                ", nomCommune='" + nomCommune + '\'' +
                ", populationTotale=" + populationTotale +
                '}';
    }
}
