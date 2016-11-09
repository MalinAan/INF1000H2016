class Aktivitet{
  private String aktNavn;
  private int start;

  Aktivitet(String hva, int kl){
    aktNavn = hva;
    start = kl;
  }

  public String toString(){
    return aktNavn;
  }
}
