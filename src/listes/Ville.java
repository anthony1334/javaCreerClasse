package listes;

import java.util.ArrayList;

public class Ville implements Comparable<Ville> {
   String nom;
   int nbrHabitants;

   public Ville(String nom, int nbrHabitants) {
      this.nom = nom;
      this.nbrHabitants = nbrHabitants;
   }

   public String getNom() {
      return nom;
   }

   public void setNom(String nom) {
      this.nom = nom;
   }

   public int getNbrHabitants() {
      return nbrHabitants;
   }

   public void setNbrHabitants(int nbrHabitants) {
      this.nbrHabitants = nbrHabitants;
   }

   public Ville() {
   }


   @Override
   public int compareTo(Ville o) {
      int result = this.nbrHabitants - o.nbrHabitants;
      return result;
   }
}
