import java.util.Scanner;

class TallArray{
  public static void main(String[] args){
    Scanner tastatur = new Scanner(System.in);
    int[] tallArray = new int[5];
    int teller = 0;
    while(teller < tallArray.length){
      System.out.println("Tast inn et tall!");
      String input = tastatur.nextLine(); //Henter fra bruker
      int nyttTall = Integer.parseInt(input); //Konverterer.
      tallArray[teller] = nyttTall;
      teller++;
    }

    printIntArray(tallArray);
  }

  public static void printIntArray(int[] tall){
    int teller = 0;
    while(teller < tall.length){
      System.out.println("Paa plass " + teller + " er verdien " + tall[teller]);
      teller++;
    }
  }
}
