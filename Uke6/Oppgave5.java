import java.util.ArrayList;

class Oppgave5{
  public static void main(String[] args) {
    ArrayList<Student> studenter = new ArrayList<Student>();
    Student student = new Student("Malin");
    studenter.add(student);
    if(studenter.contains(student)){
      System.out.println("Student Malin finnes i lista");
    } else {
      System.out.println("Finnes ikke i lista");
    }
    studenter.remove(student);
    System.out.println("Er tom:" + studenter.isEmpty());
    //studenter.remove(0)
  }
}
