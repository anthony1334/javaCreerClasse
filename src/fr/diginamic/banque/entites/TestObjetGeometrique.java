package fr.diginamic.banque.entites;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        Cercle cercle = new Cercle(30);
        Rectangle rectangle = new Rectangle(20, 5);
        ObjetGeometrique[] tableauObjetgemetrique = new ObjetGeometrique[2];
        tableauObjetgemetrique[0] = cercle;
        tableauObjetgemetrique[1] = rectangle;
        for (int i = 0; i < tableauObjetgemetrique.length; i++) {
           if(tableauObjetgemetrique[i].equals(cercle)){
               System.out.println("le perimetre du rectangle "
                       + i +
                       " est de "
                       + tableauObjetgemetrique[i].perimetre()
                       + " et sa surface est de "
                       + tableauObjetgemetrique[i].surface());
           }else{
               System.out.println("le perimetre du cercle "
                       + i +
                       " est de "
                       + tableauObjetgemetrique[i].perimetre()
                       + " et sa surface est de " + tableauObjetgemetrique[i].surface());
           }

        }

    }
}
