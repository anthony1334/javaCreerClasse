package fr.diginamic.operations;

public class Operations {
    public double calcul(double a, char operateur, double b){
        switch (operateur){
            case '+' :
                return a +b ;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if(  b != 0 ){

                    return a / b;
                }else {
                    System.out.println("Impossible de diviser par 0");
                }

            default:
                System.out.println( "Ce n'est pas un chiffre" );
                return 0;


        }
    }
}
