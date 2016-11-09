class Ukedag{
  private Aktivitet [] aktiviteter = new Aktivitet[24];
  private String dag;
  Ukedag(String dag){
    this.dag = dag;
  }

  void printUtMineAktiviteter(){
    for(int i = 0; i < aktiviteter.length; i++){
      if(aktiviteter[i] != null){
        System.out.println("Kl " + i + ": " + aktiviteter[i].toString());
      }
    }
  }

  void settInn(String hva, int kl){
    if(aktiviteter[kl] != null){
      //Finnes allerede aktivitet paa tidspunktet.
      System.out.println(kl + "har allerede en aktivitet");
    } else {
      /*
      Alternativt:
      Aktivitet nyAktivitet = new Aktivitet(hva, kl);
      aktiviteter[kl] = nyAktivitet;
      */
      aktiviteter[kl] = new Aktivitet(hva, kl);
    }
  }

  int tidligste(){
    for(int i = 0; i < aktiviteter.length; i++){
      if(aktiviteter[i] != null){
        return i;
      }
    }
    //Feilverdi:
    return -1;
  }

  int seneste(){
    for(int i = (aktiviteter.length - 1); i >= 0; i--){
      if(aktiviteter[i] != null){
        return i;
      }
    }

    //Feilverdi:
    return -1;
  }

  int antall(){
    int antallAktiviteter = 0;

    for(int i = 0; i < aktiviteter.length; i++){
      if(aktiviteter[i] != null){
        antallAktiviteter++;
      }
    }

    return antallAktiviteter;
  }

  void settInnLedig(String hva){
    if(antall() == 0){
      settInn(hva, 12);
      return;
    } else if(antall() == 24){
      System.out.println("Kalenderen er full!");
      return;
    }

    int tidligste = tidligste();
    int seneste = seneste();

    for(int i = tidligste; i < seneste; i++){
      if(aktiviteter[i] == null){
        //Tidspunkt er ledig!
        settInn(hva, i);
        return;
      }
    }

    if(seneste != 23){
      settInn(hva, (seneste + 1));
      return;
    }

    if(tidligste != 0){
      settInn(hva, (tidligste - 1));
    }

  }
}
