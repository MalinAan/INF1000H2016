import java.util.HashMap;
import java.io.File;
import java.util.Scanner;

public class OppskriftsBok{
  private HashMap<String, Oppskrift> oppskrifter = new HashMap<String, Oppskrift>();

  public void lesFraFil(String filnavn) throws Exception{

    File f = new File(filnavn);
    Scanner fil = new Scanner(f);

    String linje = fil.nextLine(); //Forste linje er "Tittel".

    while(true){
      linje = fil.nextLine(); //Forste linje er oppskriftstittelen.
      Oppskrift oppskriften = new Oppskrift(linje);
      oppskrifter.put(linje, oppskriften);


      //Legger til ingredienser.
      linje = fil.nextLine();
      while(!linje.equals("Oppskrift:")){
        oppskriften.leggTilIngrediens(linje);
        linje = fil.nextLine();
      }



      //Legg til oppskriftstekst.
      linje = fil.nextLine();
      while(!linje.equals("Tittel:")){
        oppskriften.leggTilOppskriftsLinje(linje);
        linje = fil.nextLine();
        if(!fil.hasNextLine()){
          return;
        }
      }
    }
  }
  /*Skriver ut alle oppskrifter i boken.*/
  public void skrivUtAlleOppskrifter(){
    for(Oppskrift oppskriften : oppskrifter.values()){
      System.out.println(oppskriften.toString());
      System.out.println("Ingredienser:");
      oppskriften.skrivUtIngredienser();
      System.out.println("Oppskrift:");
      oppskriften.skrivUtOppskrift();
      System.out.println("\n");
    }

  }
  /*Sjekker om en oppskrift finnes i boken*/
  public boolean finnesOppskrift(String oppskriftsTittel){
    if(oppskrifter.containsKey(oppskriftsTittel)){
      return true;
    } return false;
  }

  /*Skriv ut spesifikk oppskrift.
  Tips: Du bure sjekke om oppskriftstittelen finnes forst.*/
  public void skrivUtOppskrift(String oppskriftsTittel){

    //Sjekker om oppskriften finnes. Om ikke, returner fra metoden.
    if(!finnesOppskrift(oppskriftsTittel)){
      //Hvis man kommer inn her, finnes ikke oppskriften og vi returnerer fra metoden.
      return;
    }

    Oppskrift oppskriften = oppskrifter.get(oppskriftsTittel);
    System.out.println(oppskriften.toString());
    System.out.println("Ingredienser:");
    oppskriften.skrivUtIngredienser();
    System.out.println("Oppskrift:");
    oppskriften.skrivUtOppskrift();
    System.out.println("\n");
  }
}
