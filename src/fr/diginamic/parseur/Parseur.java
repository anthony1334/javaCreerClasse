package fr.diginamic.parseur;

public class Parseur {

    public static Expression parse(String chaine){

       String[] parseString ={};
       String operator = "";
       chaine= chaine.replaceAll(" ","");
if(chaine.indexOf('*') != -1 ){
    parseString= chaine.split("\\*");
    operator = "*";
} else if(chaine.indexOf('/') != -1){
    parseString= chaine.split("/");
    operator = "/";
}else if (chaine.indexOf('+') != -1) {
    parseString = chaine.split("\\+");
    operator = "+";
} else if(chaine.indexOf('-') != -1){
        parseString= chaine.split("-");
        operator = "-";
    }
return  new Expression(parseString[0],parseString[1],operator);

}

}
