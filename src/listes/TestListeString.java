package listes;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListeString {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"
        ));
       String motLePlusLong = arrayList.get(0);
        for (int i = 0; i < arrayList.size(); i++) {

            if(arrayList.get(i).length() > motLePlusLong.length()){
                motLePlusLong = arrayList.get(i);
            }


        }
        System.out.println(motLePlusLong);


    }


}
