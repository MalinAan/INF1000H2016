class SwitchUkedag{
  public static void main(String[] args) {
    int ukedag = 1;
    String ukedagString;

    switch(ukedag){
      case 1: ukedagString = "Mandag"; break;
      case 2: ukedagString = "Tirsdag"; break;
      case 3: ukedagString = "Onsdag"; break;
      case 4: ukedagString = "Torsdag"; break;
      case 5: ukedagString = "Fredag"; break;
      case 6: ukedagString = "Lordag"; break;
      case 7: ukedagString = "Sondag"; break;
      default: ukedagString = "Ugyldig dag"; break;
    }
    System.out.println(ukedagString);
  }
}
