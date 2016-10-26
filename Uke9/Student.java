import java.util.HashMap;

public class Student{
  private String navn;
  private HashMap<String, Fag> mineFag = new HashMap<String, Fag>();

  public Student(String navn){
    this.navn = navn;
  }

  public void leggTilFag(Fag fag){
    if(tarFag(fag)){
      System.out.println(navn + " tar allerede " + fag.toString());
      return;
    }
    mineFag.put(fag.toString(), fag);
  }

  public String toString(){
    return navn;
  }

  public void skrivUtMineFag(){
    for(Fag etFag : mineFag.values()){
      System.out.println(etFag.toString());
    }
  }

  public boolean tarFag(Fag fag){
    if(mineFag.containsValue(fag)){
      return true;
    } return false;
  }

  public void meldMegAvAlleFag(){
    for(Fag fagJegTar : mineFag.values()){
      fagJegTar.fjernStudent(this);
    }
  }

  public void fjernFagFraStudent(Fag fag){
    if(!tarFag(fag)){
      System.out.println(navn + " har aldri vaert meldt opp i " + fag.toString());
      return;
    }
    mineFag.remove(fag);
  }

  public int antFag(){
    return mineFag.size();
  }
}
