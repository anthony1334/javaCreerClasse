package fr.diginamic.banque.entites;

public abstract class Operation {
    protected String date;
    protected double montantOperation;

    public Operation(String date, double montantOperation) {
        this.date = date;
        this.montantOperation = montantOperation;
    }

    public abstract String getType();


    @Override
    public String toString() {
        return "Operation{" +
                "date='" + date + '\'' +
                ", montantOperation=" + montantOperation +
                '}';
    }

    public double getMontantOperation() {
        return montantOperation;
    }
}
