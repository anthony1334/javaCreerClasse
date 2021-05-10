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

    public double evaluer(char a, double valeur){
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
