import java.util.ArrayList;

public class Oppskrift{
  private String tittel;
  private ArrayList<String> oppskriftsLinjer = new ArrayList<String>();
  private ArrayList<String> ingredienser = new ArrayList<String>();

  public Oppskrift(String tittel){
    this.tittel = tittel;
  }

  /*Skriver ut oppskriften.*/
  public void skrivUtOppskrift(){
    for(String linje : oppskriftsLinjer){
      System.out.println(linje);
    }

  }

  /*Skriver ut ingredienser*/
  public void skrivUtIngredienser(){
    for(String ingrediens : ingredienser){
      System.out.println(ingrediens);
    }

  }

  /*Legger til en ingrediens i oppskriften.*/
  public void leggTilIngrediens(String ingrediensen){
    ingredienser.add(ingrediensen);

  }


  public void leggTilOppskriftsLinje(String linje){
    oppskriftsLinjer.add(linje);
  }


  public String toString(){
    return tittel;
  }

}
