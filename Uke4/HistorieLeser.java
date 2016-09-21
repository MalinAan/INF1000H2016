import java.util.Scanner;
import java.io.File;

class HistorieLeser{
  public static void main(String[] args) throws Exception{
    String filnavn = "historier.txt";
    File fil = new File(filnavn);
    Scanner innfil = new Scanner(fil);
    String[] linjerIFilen = new String[42];

    int teller = 0;
    while(innfil.hasNextLine()){
      linjerIFilen[teller] = innfil.nextLine();
      teller++;
    }

    /*for(int i = 0; i < linjerIFilen.length; i++){
      System.out.println(linjerIFilen[i]);
    }*/
    System.out.println("*****FORSTE HISTORIE*****");
    for(int i = 0; i < linjerIFilen.length; i = i + 2){
      System.out.println(linjerIFilen[i]);
    }

    System.out.println("\n\n\n******ANDRE HISTORIE *****");
    for(int i = 1; i < linjerIFilen.length; i = i + 2){
      System.out.println(linjerIFilen[i]);
    }
  }
}
