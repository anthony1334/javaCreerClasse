package fr.diginamic.parseur;

public class Expression {
   String operandGauche;
   String operandeDroite;
   String operateur;

    public Expression(String operandGauche, String operandeDroite, String operateur) {
        this.operandGauche = operandGauche;
        this.operandeDroite = operandeDroite;
        this.operateur = operateur;
    }

    public double evaluer(String param, double valeur){

        double un = 0.0;
        double deux = 0.0;
        if(operandGauche.equals(param)){
            un = valeur;
            deux = Double.parseDouble(operandeDroite);
        }else{
            deux = valeur;
            un = Double.parseDouble(operandGauche);

        }
      switch (operateur){
          case "+":

              return un + deux;
          case "-":
              return un - deux;
          case "/":
              return un / deux;
          case "*":
              return un  * deux;
      }
        return 0.0;
    }

    @Override
    public String toString() {
        return "Expression{" +
                "operandGauche='" + operandGauche + '\'' +
                ", operandeDroite='" + operandeDroite + '\'' +
                ", operateur='" + operateur + '\'' +
                '}';
    }
}
