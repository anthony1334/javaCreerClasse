package fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {
    public static void main(String[] args)  {

        // fichier d'origine
        Path path = Paths.get("./recensement.csv");



        List<String> lines = null;
        ArrayList <String> outputArraylist = new ArrayList<>()  ;
        try {
            lines = Files.readAllLines(path);
            RecensementModif recensementModif = new RecensementModif();
            // lecture et réecritures des entêtes

            String[] entete = lines.get(0).split(";");//Découpage des titres de colonne
            outputArraylist.add(entete[6]+";"+entete[0]+";"+entete[9]) ;//Ajout des titres de colonnes qui nous intérressent
            lines.remove(0);// Retire ligne d'entête des autres données(permet de traiter les autre données)


            //Lecture des données

            for (String line: lines) {
               recensementModif.setData(line);
               if(recensementModif.nbrHabitant > 25000){
                   outputArraylist.add(recensementModif.getData());
               }

            }
            //Ouverture du fichier en écriture
            Path pathCible = Paths.get("./recensement2.csv");
            Files.write(pathCible, outputArraylist);

        } catch (IOException e) {
            e.printStackTrace();
        }




        //Ecriture des nouvelles donées dans le fichier de sortie



    }
}
