public class Mainmetode{
  public static void main(String [] args) throws Exception{
    OppskriftsBok oppskriftsboken = new OppskriftsBok();
    oppskriftsboken.lesFraFil("oppskrifter.txt");

    //Skriver ut alle oppskrifter til terminal
    oppskriftsboken.skrivUtAlleOppskrifter();

    //Sjekker om "Kantarellsuppe" finnes - burde returnere true.
    System.out.println("Finnes kantarellsuppe i oppskriftsboken? Status: " + oppskriftsboken.finnesOppskrift("Kantarellsuppe"));

    //Sjekker om "Tomatsuppe" finnes - burde returnere false.
    System.out.println("Finnes tomatsuppe i oppskriften? Status: " + oppskriftsboken.finnesOppskrift("Tomatsuppe"));
  }
}
