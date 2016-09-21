class KonverterTilToDesimaler{
  public static void main(String[] args) {
    double nummerSomSkalBliKonvertert = 651.5176515121351;
    double konvertert = konverterTilToDesimaler(nummerSomSkalBliKonvertert);
    System.out.println(konvertert);

  }

  public static double konverterTilToDesimaler(double ukonvertert){
    return (Math.round(ukonvertert * 100.0))/100.0;
  }
}
