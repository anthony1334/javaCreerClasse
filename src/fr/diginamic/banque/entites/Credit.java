package fr.diginamic.banque.entites;

public class Credit extends  Operation{


    public Credit(String date, double montantOperation) {
        super(date, montantOperation);
    }

    @Override
    public String getType() {

        return "Credit";
    }

    @Override
    public String toString() {
        return getType() + super.toString();

    }
}
