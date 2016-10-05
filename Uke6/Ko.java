import java.util.ArrayList;

public class Ko{
  public static void main(String[] args) {
    Person p1 = new Person("David");
    //System.out.println(p1);
    Person p2 = new Person("Mariia");
    Person p3 = new Person("Marte");

    ArrayList<Person> ko = new ArrayList<Person>();
    ko.add(p1);
    System.out.println("Koens storrelse: " + ko.size());
    ko.add(p2);
    ko.add(p3);
    System.out.println("Koens storrelse: " + ko.size());
    System.out.println("Person " + ko.remove(0) + " gaar ut av koen");
    System.out.println("Koens storrelse: " + ko.size());

    //Gaa igjennom ArrayList ved aa bruke vanlig for-lokke
    for(int i = 0; i < ko.size(); i++){
      System.out.println(ko.get(i));
    }
    //Gaa igjennom ArrayList ved aa bruke ne for-each lokke
    for(Person person: ko){
      System.out.println(person);
    }
  }
}
