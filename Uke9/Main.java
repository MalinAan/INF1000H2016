import java.util.Scanner;

public class Main{
  public static void main(String [] args) throws Exception{
    StudentSystem studentSys = new StudentSystem();
    studentSys.lesFraFil("emnestudenter.txt");
    studentSys.ordrelokke();
    studentSys.skrivTilFil("emnestudenter.txt");
  }
}
