package fr.diginamic.banque.entites;

public class Debit extends Operation{
    public Debit(String date, double montantOperation) {
        super(date, montantOperation);
    }

    @Override
    public String getType() {
        return "Debit";
    }

    @Override
    public String toString() {
        return getType() + super.toString();
    }
}
