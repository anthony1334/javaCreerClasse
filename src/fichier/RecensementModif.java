package fichier;

public class RecensementModif {
    String ville, dpt;
   int nbrHabitant;


    public void setData(String data){
        String[] str = data.split(";");
        this.ville =str[6] ;
        this.dpt=  str[0] ;
        str[9] = str[9].trim().replaceAll(" ", "");
        this.nbrHabitant= Integer.parseInt(str[9]);


    }



    public String getData(){
            return this.ville +";" + this.dpt +";" +this.nbrHabitant;
    }

}
