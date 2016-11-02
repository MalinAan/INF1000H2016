import java.util.HashMap;

class Traversering{
  public static void main(String[] args) {
      HashMap<String, Person> personliste = new HashMap<String, Person>();
      personliste.put("Mari", new Person(155));
      personliste.put("Egil", new Person(170));
      personliste.put("Johan", new Person(100));
      personliste.put("Ove", new Person(200));
      personliste.put("Olav Johan", new Person(100));
      System.out.println("GjSnitt er " + gjSnitt(personliste));
  }

  public static double gjSnitt(HashMap<String, Person> liste){
    double sum = 0;

    for(Person p : liste.values()){
      sum += p.hentHoyde();
    }
    double gjSnitt = sum/liste.size();
    return gjSnitt;
  }
}
