import java.util.Scanner;

public class Postnummer{
  public static void main(String [] args){
    System.out.println("Vi starter i main!");
    sjekkPostnummer();
    System.out.println("Vi er tilbake i main!");
    sjekkPostnummer();
    System.out.println("Vi avslutter!");
  }

  public static void sjekkPostnummer(){
    //Oppretter scanner.
    Scanner tastatur = new Scanner(System.in);

    System.out.println("Skriv inn ditt postnummer");

    //Leser inn som streng.
    String input = tastatur.nextLine();

    //Konvertere til int
    int postnummer = Integer.parseInt(input);

    System.out.println("Du tastet inn " + postnummer);

    if(postnummer < 2500){
      System.out.println("Du bor paa Ostlandet!");
    } else if(postnummer < 5000){
      System.out.println("Du bor paa Vestlandet!");
    } else if( postnummer < 7500){
      System.out.println("Du bor paa Sorlandet");
    } else {
      System.out.println("Du bor i Nord-Norge");
    }
  }
}
