package entities;

public class AdressePostale {

        public int numerDeRue;
        public String libelleDeRue, ville;
        public int codePostal;

        public AdressePostale(int numerDeRue, String libelleDeRue, String ville, int codePostal) {
                this.numerDeRue = numerDeRue;
                this.libelleDeRue = libelleDeRue;
                this.ville = ville;
                this.codePostal = codePostal;
        }

        @Override
        public String toString() {
               return "numero de rue :" + numerDeRue + " libellé " + libelleDeRue + " ville " +ville + " codePostal " + codePostal;
        }
}
