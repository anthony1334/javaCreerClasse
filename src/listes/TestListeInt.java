package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        int max = 0;
        int min = 0;


        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-1 );
        arrayList.add(-5 );
        arrayList.add( 7 );
        arrayList.add( 3 );
        arrayList.add(-2 );
        arrayList.add(-4 );
        arrayList.add( 8 );
        arrayList.add( 5 );
        for (int i : arrayList) {
            System.out.println(i);
        }
        System.out.println("la taille de la liste " + arrayList.size());

        for (Integer integer : arrayList) {
            if(integer > max){
                max = integer;
            }
        }
        System.out.println("la valeur max est " + max);

      /* for (Integer integer : arrayList) {
            if(integer < min){
                min = integer;
                System.out.println("la plus petite valeur est " + min);
                arrayList.remove(min);

            }

        System.out.println("la plus petite valeur est " + min);*/

        for (Integer integer : arrayList) {
            int integerPositif =0;
            if(integer < 0){
                 integerPositif = - integer;
                System.out.println("la valeur" + integer + " devient positive" + integerPositif);

            }



        }
    }


}
