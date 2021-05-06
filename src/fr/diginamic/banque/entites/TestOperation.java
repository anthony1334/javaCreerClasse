package fr.diginamic.banque.entites;

public class TestOperation {
    public static void main(String[] args) {

        Credit credit1 = new Credit("01/05/2021", 501);
        Credit credit2 = new Credit("04/05/2021", 40);
        Debit debit1 = new Debit("01/05/2021", 44);
        Debit debit2 = new Debit("06/05/2021", 100);

        Operation[] tableauOperation = new Operation[4];
        tableauOperation[0] = credit1;
        tableauOperation[1] = credit2;
        tableauOperation[2] = debit1;
        tableauOperation[3] = debit2 ;

        double somme = 0;


        for (int i = 0; i < tableauOperation.length; i++) {
            if(tableauOperation[i].getType() == "Credit"){
                somme = somme + tableauOperation[i].getMontantOperation();

            }
            else if(tableauOperation[i].getType() == "Debit"){
                somme = somme - tableauOperation[i].getMontantOperation();
            }
        }
        System.out.println(somme);
    }
}
