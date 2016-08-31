import java.util.Scanner;

public class Gruppetimer{

  public static void main(String [] args){
    Scanner tastatur = new Scanner(System.in); //Oppretter Scanner-objekt.

    System.out.println("Har du tenkt til aa fortsette aa mote opp i INF1000?");

    String svar = tastatur.nextLine();
    //String braSvar = "ja";

    if(svar.equalsIgnoreCase("ja")){
      System.out.println("Du vil staa paa eksamen i INF1000!");
    } else {
      System.out.println("Sorry. Vet ikke hvordan det gaar med deg.");
    }
  }

}
