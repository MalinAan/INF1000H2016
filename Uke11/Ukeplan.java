class Ukeplan{
  String person;
  Ukedag[] ukedager = new Ukedag[7];
  Ukeplan(String hvem){
    this.person = hvem;
    ukedag[0] = new Ukedag("Mandag");
    ukedag[1] = new Ukedag("Tirsdag");
    ukedag[2] = new Ukedag("Onsdag");
    ukedag[3] = new Ukedag("Torsdag");
    ukedag[4] = new Ukedag("Fredag");
    ukedag[5] = new Ukedag("Lordag");
    ukedag[6] = new Ukedag("Sondag");
  }

  Ukedag travleste(){
    Ukedag hittilTravleste = ukedag[0];

    for(int i = 1; i < ukedag.length; i++){
      if(hittilTravleste.antall() < ukedag[i].antall()){
        hittilTravleste = ukedag[i];
      }
    }

    return hittilTravleste;
  }

  void skrivUt(){
    System.out.println("Ukeplan for " + person);
    for(int i = 0; i < ukedager.length; i++){
      if(ukedager.hentAntall() > 0){
        ukedager[i].skrivUtMineAktiviteter();
      }
    }
  }
}
